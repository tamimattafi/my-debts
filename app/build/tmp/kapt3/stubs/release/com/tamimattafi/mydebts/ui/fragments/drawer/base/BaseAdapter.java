package com.tamimattafi.mydebts.ui.fragments.drawer.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseAdapter;", "Lcom/tamimattafi/mvp/adapters/recycler/RecyclerAdapter;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "view", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;", "(Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;)V", "getEmptyHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "getItemHolder", "getLoadingHolder", "app_release"})
public class BaseAdapter extends com.tamimattafi.mvp.adapters.recycler.RecyclerAdapter<com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getEmptyHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getItemHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder getLoadingHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.View view) {
        super(null);
    }
}