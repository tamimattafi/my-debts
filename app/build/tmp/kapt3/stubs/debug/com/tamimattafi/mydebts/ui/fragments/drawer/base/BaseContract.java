package com.tamimattafi.mydebts.ui.fragments.drawer.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract;", "", "Holder", "Presenter", "View", "app_debug"})
public abstract interface BaseContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "Lcom/tamimattafi/mvp/MvpBaseContract$Holder;", "setDate", "", "date", "", "setPerson", "person", "", "setSum", "sum", "app_debug"})
    public static abstract interface Holder extends com.tamimattafi.mvp.MvpBaseContract.Holder {
        
        public abstract void setDate(long date);
        
        public abstract void setSum(@org.jetbrains.annotations.NotNull()
        java.lang.String sum);
        
        public abstract void setPerson(@org.jetbrains.annotations.NotNull()
        java.lang.String person);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Presenter;", "Lcom/tamimattafi/mvp/MvpBaseContract$RecyclerPresenter;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "app_debug"})
    public static abstract interface Presenter extends com.tamimattafi.mvp.MvpBaseContract.RecyclerPresenter<com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder> {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$View;", "Lcom/tamimattafi/mvp/MvpBaseContract$ListenerView;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "onHolderAction", "", "holder", "action", "", "onHolderClick", "app_debug"})
    public static abstract interface View extends com.tamimattafi.mvp.MvpBaseContract.ListenerView<com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder> {
        
        @java.lang.Override()
        public abstract void onHolderAction(@org.jetbrains.annotations.Nullable()
        com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder, int action);
        
        @java.lang.Override()
        public abstract void onHolderClick(@org.jetbrains.annotations.NotNull()
        com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            @java.lang.Override()
            public static void onHolderAction(com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.View $this, @org.jetbrains.annotations.Nullable()
            com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder, int action) {
            }
            
            @java.lang.Override()
            public static void onHolderClick(com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.View $this, @org.jetbrains.annotations.NotNull()
            com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder holder) {
            }
        }
    }
}