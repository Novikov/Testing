package com.raywenderlich.android.cocktails.game.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory;", "", "buildGame", "", "callback", "Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory$Callback;", "Callback", "app_debug"})
public abstract interface CocktailsGameFactory {
    
    public abstract void buildGame(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory.Callback callback);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory$Callback;", "", "onError", "", "onSuccess", "game", "Lcom/raywenderlich/android/cocktails/game/model/Game;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onSuccess(@org.jetbrains.annotations.NotNull()
        com.raywenderlich.android.cocktails.game.model.Game game);
        
        public abstract void onError();
    }
}