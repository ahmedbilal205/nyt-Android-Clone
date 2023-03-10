package com.ahmed.nytimes.ui.bookmark

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.ahmed.nytimes.R
import com.ahmed.nytimes.adapter.TopStoriesAdapter
import com.ahmed.nytimes.databinding.FragmentSavedArticleBinding
import com.ahmed.nytimes.ui.MainActivity
import com.ahmed.nytimes.viewmodel.MainViewModel
import com.google.android.material.snackbar.Snackbar

class BookmarkFragment : Fragment() {

    private var _binding: FragmentSavedArticleBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: MainViewModel
    private lateinit var newsAdapter: TopStoriesAdapter


    private val background = ColorDrawable()
    private val backgroundColor = Color.parseColor("#ba000d")


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavedArticleBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        setupRecyclerView()

        newsAdapter.setOnItemClickListener {
            val bundle = Bundle().apply {
                putSerializable("article", it)
            }

            findNavController().navigate(
                R.id.action_bookmarkFragment_to_articleDetailFragment,
                bundle
            )
        }

        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(
            0,
            ItemTouchHelper.LEFT
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {

                val deleteIcon = ContextCompat.getDrawable(requireContext(), R.drawable.ic_delete)!!
                val intrinsicWidth = deleteIcon.intrinsicWidth + 30
                val intrinsicHeight = deleteIcon.intrinsicHeight + 30

                val itemView = viewHolder.itemView
                val itemHeight = itemView.bottom - itemView.top

                //draw red delete
                background.color = backgroundColor
                background.setBounds(
                    itemView.right + dX.toInt(),
                    itemView.top,
                    itemView.right,
                    itemView.bottom
                )
                background.draw(c)

                //calculate position of delete icon
                val iconTop = itemView.top + (itemHeight - intrinsicHeight) / 2
                val iconMargin = (itemHeight - intrinsicHeight) / 2
                val iconLeft = itemView.right - iconMargin - intrinsicWidth
                val iconRight = itemView.right - iconMargin
                val iconBottom = iconTop + intrinsicHeight

                deleteIcon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                deleteIcon.draw(c)
                super.onChildDraw(
                    c,
                    recyclerView,
                    viewHolder,
                    dX,
                    dY,
                    actionState,
                    isCurrentlyActive
                )
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val article = newsAdapter.asyncListDiffer.currentList[position]

                viewModel.deleteArticle(article)
                Snackbar.make(view, "Article deleted", Snackbar.LENGTH_LONG).apply {
                    setAction("Undo") {
                        viewModel.saveArticle(article)
                    }
                    show()
                }
            }

        }

        ItemTouchHelper(itemTouchHelperCallback).apply {
            attachToRecyclerView(binding.rvBookmark)
        }

        viewModel.getSavedArticle().observe(viewLifecycleOwner) { articles ->
            newsAdapter.asyncListDiffer.submitList(articles)
        }
    }

    private fun setupRecyclerView() {
        newsAdapter = TopStoriesAdapter()
        binding.rvBookmark.apply {
            adapter = newsAdapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}