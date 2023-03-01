package com.ahmed.nytimes.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/ahmed/nytimes/api/NewsApi;", "", "getTopStories", "Lretrofit2/Response;", "Lcom/ahmed/nytimes/data/model/TopStories;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface NewsApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.ahmed.nytimes.api.NewsApi.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.nytimes.com/svc/topstories/v2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "HSpd39LV580xPShqdMlALdD3w8wZ3OOg";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "home.json")
    public abstract java.lang.Object getTopStories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api-key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.ahmed.nytimes.data.model.TopStories>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ahmed/nytimes/api/NewsApi$Companion;", "", "()V", "API_KEY", "", "BASE_URL", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.nytimes.com/svc/topstories/v2/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String API_KEY = "HSpd39LV580xPShqdMlALdD3w8wZ3OOg";
        
        private Companion() {
            super();
        }
    }
}