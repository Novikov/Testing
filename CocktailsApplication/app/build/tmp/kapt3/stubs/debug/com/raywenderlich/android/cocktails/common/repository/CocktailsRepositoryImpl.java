package com.raywenderlich.android.cocktails.common.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00102\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepositoryImpl;", "Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;", "api", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;", "(Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;)V", "getAlcoholicCall", "Lretrofit2/Call;", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsContainer;", "getAlcoholic", "", "callback", "Lcom/raywenderlich/android/cocktails/common/repository/RepositoryCallback;", "", "Lcom/raywenderlich/android/cocktails/common/network/Cocktail;", "", "wrapCallback", "Lretrofit2/Callback;", "app_debug"})
public final class CocktailsRepositoryImpl implements com.raywenderlich.android.cocktails.common.repository.CocktailsRepository {
    private retrofit2.Call<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> getAlcoholicCall;
    private final com.raywenderlich.android.cocktails.common.network.CocktailsApi api = null;
    
    @java.lang.Override()
    public void getAlcoholic(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.repository.RepositoryCallback<java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail>, java.lang.String> callback) {
    }
    
    private final retrofit2.Callback<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> wrapCallback(com.raywenderlich.android.cocktails.common.repository.RepositoryCallback<java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail>, java.lang.String> callback) {
        return null;
    }
    
    public CocktailsRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.network.CocktailsApi api) {
        super();
    }
}