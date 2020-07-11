package com.raywenderlich.android.cocktails.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0011J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004R\u0011\u0010\b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/model/Game;", "", "questions", "", "Lcom/raywenderlich/android/cocktails/game/model/Question;", "highest", "", "(Ljava/util/List;I)V", "currentScore", "getCurrentScore", "()I", "highestScore", "getHighestScore", "questionIndex", "score", "Lcom/raywenderlich/android/cocktails/game/model/Score;", "answer", "", "question", "option", "", "incrementScore", "nextQuestion", "app_debug"})
public final class Game {
    private final com.raywenderlich.android.cocktails.game.model.Score score = null;
    private int questionIndex;
    private final java.util.List<com.raywenderlich.android.cocktails.game.model.Question> questions = null;
    
    public final int getCurrentScore() {
        return 0;
    }
    
    public final int getHighestScore() {
        return 0;
    }
    
    public final void incrementScore() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.raywenderlich.android.cocktails.game.model.Question nextQuestion() {
        return null;
    }
    
    public final void answer(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.model.Question question, @org.jetbrains.annotations.NotNull()
    java.lang.String option) {
    }
    
    public Game(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.cocktails.game.model.Question> questions, int highest) {
        super();
    }
}