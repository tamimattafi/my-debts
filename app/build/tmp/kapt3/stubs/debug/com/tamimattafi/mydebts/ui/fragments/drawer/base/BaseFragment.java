package com.tamimattafi.mydebts.ui.fragments.drawer.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseFragment;", "Lcom/tamimattafi/mvp/navigation/fragment/MvpFragment;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Presenter;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;", "type", "", "(I)V", "adapter", "Lcom/tamimattafi/mvp/MvpBaseContract$Adapter;", "layoutId", "getLayoutId", "()I", "setLayoutId", "bindHolder", "", "holder", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "getAdapter", "onSetupPresenter", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "prepareAdapter", "showMessage", "message", "", "prepareRecycler", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_debug"})
public abstract class BaseFragment extends com.tamimattafi.mvp.navigation.fragment.MvpFragment<com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Presenter> implements com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.View {
    private int layoutId;
    private com.tamimattafi.mvp.MvpBaseContract.Adapter adapter;
    private final int type = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setLayoutId(int p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Presenter onSetupPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tamimattafi.mvp.MvpBaseContract.Adapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void bindHolder(@org.jetbrains.annotations.NotNull()
    com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.tamimattafi.mvp.MvpBaseContract.Adapter prepareAdapter() {
        return null;
    }
    
    public void prepareRecycler(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> $this$prepareRecycler) {
    }
    
    public BaseFragment(int type) {
        super();
    }
    
    @java.lang.Override()
    public void onHolderAction(@org.jetbrains.annotations.Nullable()
    com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder, int action) {
    }
    
    @java.lang.Override()
    public void onHolderClick(@org.jetbrains.annotations.NotNull()
    com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder) {
    }
}