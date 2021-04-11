package com.raywenderlich.android.cocktails.common.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u0005H&J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\nH&\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;", "", "getAlcoholic", "", "callback", "Lcom/raywenderlich/android/cocktails/common/repository/RepositoryCallback;", "", "Lcom/raywenderlich/android/cocktails/common/network/Cocktail;", "", "getHighScore", "", "saveHighScore", "score", "app_debug"})
public abstract interface CocktailsRepository {
    
    public abstract void getAlcoholic(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.repository.RepositoryCallback<java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail>, java.lang.String> callback);
    
    public abstract void saveHighScore(int score);
    
    public abstract int getHighScore();
}