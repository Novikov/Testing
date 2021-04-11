package com.raywenderlich.android.cocktails.common.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;", "", "getAlcoholic", "Lretrofit2/Call;", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsContainer;", "getById", "id", "", "getByName", "name", "Factory", "app_debug"})
public abstract interface CocktailsApi {
    public static final com.raywenderlich.android.cocktails.common.network.CocktailsApi.Factory Factory = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "filter.php?a=Alcoholic")
    public abstract retrofit2.Call<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> getAlcoholic();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search.php")
    public abstract retrofit2.Call<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> getByName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "s")
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lookup.php")
    public abstract retrofit2.Call<com.raywenderlich.android.cocktails.common.network.CocktailsContainer> getById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "i")
    java.lang.String id);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi$Factory;", "", "()V", "create", "Lcom/raywenderlich/android/cocktails/common/network/CocktailsApi;", "app_debug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final com.raywenderlich.android.cocktails.common.network.CocktailsApi create() {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}