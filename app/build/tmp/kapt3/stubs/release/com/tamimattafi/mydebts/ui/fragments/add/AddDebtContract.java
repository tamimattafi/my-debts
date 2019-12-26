package com.tamimattafi.mydebts.ui.fragments.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract;", "", "DateDialog", "Presenter", "View", "app_release"})
public abstract interface AddDebtContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$View;", "Lcom/tamimattafi/mvp/MvpBaseContract$View;", "getCreditor", "", "getCurrency", "getDate", "", "getIsDebtor", "", "getSum", "isCreditorNotEmpty", "isDateSet", "isSumNotEmpty", "onDebtAdded", "", "onDebtAddingError", "app_release"})
    public static abstract interface View extends com.tamimattafi.mvp.MvpBaseContract.View {
        
        public abstract boolean isCreditorNotEmpty();
        
        public abstract boolean isSumNotEmpty();
        
        public abstract boolean isDateSet();
        
        public abstract boolean getIsDebtor();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCreditor();
        
        public abstract long getDate();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getSum();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getCurrency();
        
        public abstract void onDebtAdded();
        
        public abstract void onDebtAddingError();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$Presenter;", "Lcom/tamimattafi/mvp/MvpBaseContract$Presenter;", "saveDebt", "", "app_release"})
    public static abstract interface Presenter extends com.tamimattafi.mvp.MvpBaseContract.Presenter {
        
        public abstract void saveDebt();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J+\u0010\u0007\u001a\u00020\u00002!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\tH&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/tamimattafi/mydebts/ui/fragments/add/AddDebtContract$DateDialog;", "", "dismiss", "", "setCancelListener", "onCancel", "Lkotlin/Function0;", "setConfirmationListener", "onConfirm", "Lkotlin/Function1;", "Ljava/util/Date;", "Lkotlin/ParameterName;", "name", "date", "show", "app_release"})
    public static abstract interface DateDialog {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.DateDialog setConfirmationListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.Date, kotlin.Unit> onConfirm);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.DateDialog setCancelListener(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function0<kotlin.Unit> onCancel);
        
        public abstract void show();
        
        public abstract void dismiss();
    }
}