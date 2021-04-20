package com.raywenderlich.android.punchline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lcom/raywenderlich/android/punchline/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/punchline/Repository;", "(Lcom/raywenderlich/android/punchline/Repository;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/raywenderlich/android/punchline/UiModel;", "getState$app_debug", "()Landroidx/lifecycle/MutableLiveData;", "setState$app_debug", "(Landroidx/lifecycle/MutableLiveData;)V", "getJoke", "", "onCleared", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.raywenderlich.android.punchline.UiModel> state;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private final com.raywenderlich.android.punchline.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.raywenderlich.android.punchline.UiModel> getState$app_debug() {
        return null;
    }
    
    public final void setState$app_debug(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.raywenderlich.android.punchline.UiModel> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void getJoke() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.punchline.Repository repository) {
        super();
    }
}