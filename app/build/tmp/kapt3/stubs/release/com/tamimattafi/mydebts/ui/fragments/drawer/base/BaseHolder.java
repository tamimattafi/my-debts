package com.tamimattafi.mydebts.ui.fragments.drawer.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J+\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0014\u0010\u0017\u001a\u00020\u0007*\u00020\u00182\u0006\u0010\b\u001a\u00020\tH\u0002\u00a8\u0006\u0019"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseHolder;", "Lcom/tamimattafi/mvp/adapters/recycler/holders/RecyclerHolder;", "Lcom/tamimattafi/mydebts/ui/fragments/drawer/base/BaseContract$Holder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "setDate", "", "date", "", "setHolderActionListener", "Lcom/tamimattafi/mvp/MvpBaseContract$ListenerHolder;", "onAction", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "action", "setPerson", "person", "", "setSum", "sum", "attachDate", "Landroid/widget/TextView;", "app_release"})
public class BaseHolder extends com.tamimattafi.mvp.adapters.recycler.holders.RecyclerHolder implements com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract.Holder {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tamimattafi.mvp.MvpBaseContract.ListenerHolder setHolderActionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onAction) {
        return null;
    }
    
    @java.lang.Override()
    public void setDate(long date) {
    }
    
    @java.lang.Override()
    public void setSum(@org.jetbrains.annotations.NotNull()
    java.lang.String sum) {
    }
    
    @java.lang.Override()
    public void setPerson(@org.jetbrains.annotations.NotNull()
    java.lang.String person) {
    }
    
    private final void attachDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$attachDate, long date) {
    }
    
    public BaseHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}