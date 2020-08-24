package com.raywenderlich.android.cocktails.game.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0003J.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142 \b\u0002\u0010\u0015\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/android/cocktails/game/model/Question;", "", "correctOption", "", "incorrectOption", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "<set-?>", "answeredOption", "getAnsweredOption", "()Ljava/lang/String;", "getCorrectOption", "getImageUrl", "getIncorrectOption", "isAnsweredCorrectly", "", "()Z", "answer", "option", "getOptions", "", "sort", "Lkotlin/Function1;", "app_debug"})
public final class Question {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String answeredOption;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String correctOption = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String incorrectOption = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String imageUrl = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnsweredOption() {
        return null;
    }
    
    public final boolean isAnsweredCorrectly() {
        return false;
    }
    
    public final boolean answer(@org.jetbrains.annotations.NotNull()
    java.lang.String option) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOptions(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>> sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorrectOption() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIncorrectOption() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageUrl() {
        return null;
    }
    
    public Question(@org.jetbrains.annotations.NotNull()
    java.lang.String correctOption, @org.jetbrains.annotations.NotNull()
    java.lang.String incorrectOption, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
        super();
    }
}