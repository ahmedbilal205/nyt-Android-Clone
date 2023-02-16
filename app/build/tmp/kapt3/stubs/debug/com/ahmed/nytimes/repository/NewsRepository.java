package com.ahmed.nytimes.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/ahmed/nytimes/repository/NewsRepository;", "", "db", "Lcom/ahmed/nytimes/data/local/ArticleDatabase;", "(Lcom/ahmed/nytimes/data/local/ArticleDatabase;)V", "getDb", "()Lcom/ahmed/nytimes/data/local/ArticleDatabase;", "deleteSavedArticle", "", "article", "Lcom/ahmed/nytimes/data/model/Article;", "(Lcom/ahmed/nytimes/data/model/Article;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedArticle", "Landroidx/lifecycle/LiveData;", "", "getTopStories", "Lretrofit2/Response;", "Lcom/ahmed/nytimes/data/model/TopStories;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "app_debug"})
public final class NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.ahmed.nytimes.data.local.ArticleDatabase db = null;
    
    public NewsRepository(@org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.data.local.ArticleDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ahmed.nytimes.data.local.ArticleDatabase getDb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopStories(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ahmed.nytimes.data.model.TopStories>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.ahmed.nytimes.data.model.Article>> getSavedArticle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteSavedArticle(@org.jetbrains.annotations.NotNull()
    com.ahmed.nytimes.data.model.Article article, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}