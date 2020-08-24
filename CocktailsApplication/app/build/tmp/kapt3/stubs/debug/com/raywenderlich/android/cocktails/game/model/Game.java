package com.raywenderlich.android.cocktails.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\rJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/model/Game;", "", "questions", "", "Lcom/raywenderlich/android/cocktails/game/model/Question;", "score", "Lcom/raywenderlich/android/cocktails/game/model/Score;", "(Ljava/util/List;Lcom/raywenderlich/android/cocktails/game/model/Score;)V", "questionIndex", "", "getScore", "()Lcom/raywenderlich/android/cocktails/game/model/Score;", "answer", "", "question", "option", "", "incrementScore", "nextQuestion", "app_debug"})
public final class Game {
    private int questionIndex;
    private final java.util.List<com.raywenderlich.android.cocktails.game.model.Question> questions = null;
    @org.jetbrains.annotations.NotNull()
    private final com.raywenderlich.android.cocktails.game.model.Score score = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.cocktails.game.model.Score getScore() {
        return null;
    }
    
    public Game(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.cocktails.game.model.Question> questions, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.cocktails.game.model.Score score) {
        super();
    }
}