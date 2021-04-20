package com.raywenderlich.android.punchline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/punchline/RepositoryImpl;", "Lcom/raywenderlich/android/punchline/Repository;", "service", "Lcom/raywenderlich/android/punchline/JokeService;", "(Lcom/raywenderlich/android/punchline/JokeService;)V", "getJoke", "Lio/reactivex/Single;", "Lcom/raywenderlich/android/punchline/Joke;", "app_release"})
public final class RepositoryImpl implements com.raywenderlich.android.punchline.Repository {
    private final com.raywenderlich.android.punchline.JokeService service = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.raywenderlich.android.punchline.Joke> getJoke() {
        return null;
    }
    
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.punchline.JokeService service) {
        super();
    }
}