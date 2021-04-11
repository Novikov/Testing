package com.raywenderlich.android.cocktails.common.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/cocktails/common/repository/RepositoryCallback;", "T", "E", "", "onError", "", "e", "(Ljava/lang/Object;)V", "onSuccess", "t", "app_debug"})
public abstract interface RepositoryCallback<T extends java.lang.Object, E extends java.lang.Object> {
    
    public abstract void onSuccess(T t);
    
    public abstract void onError(E e);
}