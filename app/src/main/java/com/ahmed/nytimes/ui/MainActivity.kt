package com.ahmed.nytimes.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.ahmed.nytimes.R
import com.ahmed.nytimes.data.local.ArticleDatabase
import com.ahmed.nytimes.repository.NewsRepository
import com.ahmed.nytimes.viewmodel.MainViewModel
import com.ahmed.nytimes.viewmodel.NewsViewModelProviderFactory

//NYT Clone Android app
//Developed by Ahmed Bilal
//ahmedbilal205@gmail.com

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_NYTimes)
        setContentView(R.layout.activity_main)

        val newsRepository = NewsRepository(ArticleDatabase.getInstance(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory)[MainViewModel::class.java]

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navHostFragment.findNavController()

    }
}