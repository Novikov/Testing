package com.raywenderlich.android.punchline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/android/punchline/JokeService;", "", "getRandomJoke", "Lio/reactivex/Single;", "Lcom/raywenderlich/android/punchline/Joke;", "app_release"})
public abstract interface JokeService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "random_joke.json")
    public abstract io.reactivex.Single<com.raywenderlich.android.punchline.Joke> getRandomJoke();
}