package com.ahmed.nytimes.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180\u0017J\u0006\u0010\u000b\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0011\u0010\u001e\u001a\u00020\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/ahmed/nytimes/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "newsRepository", "Lcom/ahmed/nytimes/repository/NewsRepository;", "(Landroid/app/Application;Lcom/ahmed/nytimes/repository/NewsRepository;)V", "topStories", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ahmed/nytimes/utils/Resources;", "Lcom/ahmed/nytimes/data/model/TopStories;", "getTopStories", "()Landroidx/lifecycle/MutableLiveData;", "topStoriesResponse", "getTopStoriesResponse", "()Lcom/ahmed/nytimes/data/model/TopStories;", "setTopStoriesResponse", "(Lcom/ahmed/nytimes/data/model/TopStories;)V", "deleteArticle", "Lkotlinx/coroutines/Job;", "article", "Lcom/ahmed/nytimes/data/model/Article;", "getSavedArticle", "Landroidx/lifecycle/LiveData;", "", "handlingResponse", "response", "Lretrofit2/Response;", "hasInternetConnection", "", "safeTopStoriesCall", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveArticle", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.ahmed.nytimes.repository.NewsRepository newsRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ahmed.nytimes.utils.Resources<com.ahmed.nytimes.data.model.TopStories>> topStories = null;
    @org.jetbrains.annotations.Nullable()
    private com.ahmed.nytimes.data.model.TopStories topStoriesResponse;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app, @org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.repository.NewsRepository newsRepository) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ahmed.nytimes.utils.Resources<com.ahmed.nytimes.data.model.TopStories>> getTopStories() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ahmed.nytimes.data.model.TopStories getTopStoriesResponse() {
        return null;
    }
    
    public final void setTopStoriesResponse(@org.jetbrains.annotations.Nullable()
    com.ahmed.nytimes.data.model.TopStories p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTopStories() {
        return null;
    }
    
    private final java.lang.Object safeTopStoriesCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final com.ahmed.nytimes.utils.Resources<com.ahmed.nytimes.data.model.TopStories> handlingResponse(retrofit2.Response<com.ahmed.nytimes.data.model.TopStories> response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveArticle(@org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.data.model.Article article) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ahmed.nytimes.data.model.Article>> getSavedArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteArticle(@org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.data.model.Article article) {
        return null;
    }
    
    private final boolean hasInternetConnection() {
        return false;
    }
}