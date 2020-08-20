package com.raywenderlich.android.cocktails.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/model/Game;", "", "questions", "", "Lcom/raywenderlich/android/cocktails/game/model/Question;", "highest", "", "(Ljava/util/List;I)V", "<set-?>", "currentScore", "getCurrentScore", "()I", "highestScore", "getHighestScore", "questionIndex", "incrementScore", "", "nextQuestion", "app_debug"})
public final class Game {
    private int currentScore;
    private int highestScore;
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
    
    public Game(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.cocktails.game.model.Question> questions, int highest) {
        super();
    }
}