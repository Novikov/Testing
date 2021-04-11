package com.raywenderlich.android.cocktails.common.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0016J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u00100\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepositoryImpl;", "Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;", "api", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;Landroid/content/SharedPreferences;)V", "getAlcoholicCall", "Lretrofit2/Call;", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsContainer;", "getAlcoholic", "", "callback", "Lcom/raywenderlich/android/cocktails/common/repository/RepositoryCallback;", "", "Lcom/raywenderlich/android/cocktails/common/network/Cocktail;", "", "getHighScore", "", "saveHighScore", "score", "wrapCallback", "Lretrofit2/Callback;", "Companion", "app_debug"})
public final class CocktailsRepositoryImpl implements com.raywenderlich.android.cocktails.common.repository.CocktailsRepository {
    private retrofit2.Call<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> getAlcoholicCall;
    private final com.raywenderlich.android.cocktails.common.network.CocktailsApi api = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    private static final java.lang.String HIGH_SCORE_KEY = "HIGH_SCORE_KEY";
    public static final com.raywenderlich.android.cocktails.common.repository.CocktailsRepositoryImpl.Companion Companion = null;
    
    @java.lang.Override()
    public void getAlcoholic(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.repository.RepositoryCallback<java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail>, java.lang.String> callback) {
    }
    
    @java.lang.Override()
    public void saveHighScore(int score) {
    }
    
    @java.lang.Override()
    public int getHighScore() {
        return 0;
    }
    
    private final retrofit2.Callback<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> wrapCallback(com.raywenderlich.android.cocktails.common.repository.RepositoryCallback<java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail>, java.lang.String> callback) {
        return null;
    }
    
    public CocktailsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.network.CocktailsApi api, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepositoryImpl$Companion;", "", "()V", "HIGH_SCORE_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}