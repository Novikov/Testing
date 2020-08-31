package com.raywenderlich.android.wishlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/wishlist/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/android/wishlist/persistence/Repository;", "(Lcom/raywenderlich/android/wishlist/persistence/Repository;)V", "getWishlists", "Landroidx/lifecycle/LiveData;", "", "Lcom/raywenderlich/android/wishlist/Wishlist;", "saveNewList", "", "name", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.raywenderlich.android.wishlist.persistence.Repository repository = null;
    
    public final void saveNewList(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.raywenderlich.android.wishlist.Wishlist>> getWishlists() {
        return null;
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.wishlist.persistence.Repository repository) {
        super();
    }
}