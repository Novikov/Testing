package com.raywenderlich.android.cocktails.game.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0017J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/viewmodel/CocktailsGameViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;", "factory", "Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory;", "(Lcom/raywenderlich/android/cocktails/common/repository/CocktailsRepository;Lcom/raywenderlich/android/cocktails/game/factory/CocktailsGameFactory;)V", "errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "game", "Lcom/raywenderlich/android/cocktails/game/model/Game;", "loadingLiveData", "questionLiveData", "Lcom/raywenderlich/android/cocktails/game/model/Question;", "scoreLiveData", "Lcom/raywenderlich/android/cocktails/game/model/Score;", "answerQuestion", "", "question", "option", "", "getError", "Landroidx/lifecycle/LiveData;", "getLoading", "getQuestion", "getScore", "initGame", "nextQuestion", "app_debug"})
public final class CocktailsGameViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.cocktails.game.model.Question> questionLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.cocktails.game.model.Score> scoreLiveData = null;
    private com.raywenderlich.android.cocktails.game.model.Game game;
    private final com.raywenderlich.android.cocktails.common.repository.CocktailsRepository repository = null;
    private final com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory factory = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.android.cocktails.game.model.Question> getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.raywenderlich.android.cocktails.game.model.Score> getScore() {
        return null;
    }
    
    public final void initGame() {
    }
    
    public final void nextQuestion() {
    }
    
    public final void answerQuestion(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.model.Question question, @org.jetbrains.annotations.NotNull()
    java.lang.String option) {
    }
    
    public CocktailsGameViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.common.repository.CocktailsRepository repository, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.factory.CocktailsGameFactory factory) {
        super();
    }
}