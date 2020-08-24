package com.raywenderlich.android.cocktails.game.factory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactoryImpl;", "Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory;", "repository", "Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;", "(Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;)V", "buildGame", "", "callback", "Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory$Callback;", "buildQuestions", "", "Lcom/raywenderlich/android/cocktails/game/model/Question;", "cocktailList", "Lcom/raywenderlich/android/cocktails/common/network/Cocktail;", "app_debug"})
public final class CocktailsGameFactoryImpl implements com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory {
    private final com.raywenderlich.android.cocktails.common.repository.CocktailsRepository repository = null;
    
    @java.lang.Override()
    public void buildGame(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory.Callback callback) {
    }
    
    private final java.util.List<com.raywenderlich.android.cocktails.game.model.Question> buildQuestions(java.util.List<com.raywenderlich.android.cocktails.common.network.Cocktail> cocktailList) {
        return null;
    }
    
    public CocktailsGameFactoryImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.repository.CocktailsRepository repository) {
        super();
    }
}