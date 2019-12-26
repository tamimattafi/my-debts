package com.tamimattafi.mydebts.ui.fragments.drawer.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/main/MainAdapter;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseAdapter;", "view", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;", "(Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;)V", "headersCount", "", "getItemCount", "getItemViewType", "position", "getListPosition", "adapterPosition", "onCreateViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_debug"})
public final class MainAdapter extends com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseAdapter {
    private final int headersCount = 1;
    public static final int TYPE_HEADER = 4;
    public static final com.tamimattafi.mydebts.ui.fragments.drawer.main.MainAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getListPosition(int adapterPosition) {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.View view) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/main/MainAdapter$Companion;", "", "()V", "TYPE_HEADER", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}