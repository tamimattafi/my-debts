package com.tamimattafi.mydebts.ui.fragments.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020!H\u0016J\b\u0010%\u001a\u00020!H\u0016J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\'H\u0016J\b\u0010)\u001a\u00020\u0002H\u0016J\u001a\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\'2\u0006\u00100\u001a\u00020\u0017H\u0016J\f\u00101\u001a\u00020!*\u000202H\u0002J\f\u00103\u001a\u00020\'*\u00020\u0017H\u0002R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u00064"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtFragment;", "Lcom/tamimattafi/mvp/navigation/fragment/MvpFragment;", "Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$Presenter;", "Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$View;", "()V", "value", "Ljava/util/Date;", "date", "setDate", "(Ljava/util/Date;)V", "datePicker", "Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$DateDialog;", "getDatePicker", "()Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$DateDialog;", "datePicker$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "setLayoutId", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCreditor", "getCurrency", "getDate", "", "getIsDebtor", "", "getSum", "isCreditorNotEmpty", "isDateSet", "isSumNotEmpty", "onDebtAdded", "", "onDebtAddingError", "onSetupPresenter", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showMessage", "message", "isNotEmpty", "Lcom/google/android/material/textfield/TextInputLayout;", "showAsToast", "app_debug"})
public final class AddDebtFragment extends com.tamimattafi.mvp.navigation.fragment.MvpFragment<com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.Presenter> implements com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.View {
    private int layoutId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private java.util.Date date;
    private final kotlin.Lazy datePicker$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setLayoutId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void setDate(java.util.Date value) {
    }
    
    private final com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.DateDialog getDatePicker() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.Presenter onSetupPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isCreditorNotEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isSumNotEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isDateSet() {
        return false;
    }
    
    @java.lang.Override()
    public boolean getIsDebtor() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCreditor() {
        return null;
    }
    
    @java.lang.Override()
    public long getDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSum() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrency() {
        return null;
    }
    
    @java.lang.Override()
    public void onDebtAdded() {
    }
    
    @java.lang.Override()
    public void onDebtAddingError() {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final boolean isNotEmpty(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$isNotEmpty) {
        return false;
    }
    
    private final void showAsToast(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$showAsToast) {
    }
    
    public AddDebtFragment() {
        super();
    }
}