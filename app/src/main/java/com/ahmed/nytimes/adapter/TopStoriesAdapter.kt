package com.ahmed.nytimes.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.ahmed.nytimes.R
import com.ahmed.nytimes.data.model.Article
import com.ahmed.nytimes.databinding.ItemArticleBinding
import com.ahmed.nytimes.utils.Utils
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class TopStoriesAdapter : RecyclerView.Adapter<TopStoriesAdapter.ArticleViewHolder>() {

    private var onItemClickListener: ((Article) -> Unit)? = null
    inner class ArticleViewHolder(val binding: ItemArticleBinding) :
        RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ItemArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    private val diffCallback = object : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem.url == newItem.url
        }
        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return oldItem == newItem
        }
    }

    val asyncListDiffer = AsyncListDiffer(this, diffCallback)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article = asyncListDiffer.currentList[position]
        holder.binding.apply {
            Glide.with(this.root)
                .load(if (article.multimedia == null) R.drawable.placeholder else article.multimedia!![1].url)
                .transition(DrawableTransitionOptions.withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.DATA)
                .into(imageViewArticle)

            val sectionText = article.subsection?.ifEmpty { article.section }
            val timeAgo = article.published_date?.let { Utils.dateTimeAgo(it) }

            section.text = sectionText?.replaceFirstChar { it.uppercase() }
            tvTitle.text = article.title
            tvByline.text = article.byline?.ifEmpty { "Unknown" }
            tvAbstract.text = article.description
            tvPublished.text = timeAgo

            articleCard.setOnClickListener {
                onItemClickListener?.let { it(article) }
            }
        }
    }

    override fun getItemCount(): Int {
        return asyncListDiffer.currentList.size
    }

    fun setOnItemClickListener(listener: (Article) -> Unit) {
        onItemClickListener = listener
    }
}