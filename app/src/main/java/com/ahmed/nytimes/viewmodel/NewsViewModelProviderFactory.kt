package com.ahmed.nytimes.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ahmed.nytimes.repository.NewsRepository

class NewsViewModelProviderFactory(
    val app: Application,
    private val newsRepository: NewsRepository
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(app, newsRepository) as T
    }
}