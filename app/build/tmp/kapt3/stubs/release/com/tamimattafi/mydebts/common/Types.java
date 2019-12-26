package com.tamimattafi.mydebts.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004J!\u0010\n\u001a\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\u0002\b\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/tamimattafi/mydebts/common/Types;", "", "()V", "MY_DEBTS", "", "PEOPLE_OWE_ME", "TODAY_DEBTS", "getTypeQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "type", "prepareQuery", "query", "Lkotlin/Function1;", "Lcom/tamimattafi/mvp/repositories/database/QueryBuilder;", "Lkotlin/ExtensionFunctionType;", "app_release"})
public final class Types {
    public static final int TODAY_DEBTS = 0;
    public static final int MY_DEBTS = 1;
    public static final int PEOPLE_OWE_ME = 2;
    public static final com.tamimattafi.mydebts.common.Types INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.sqlite.db.SimpleSQLiteQuery getTypeQuery(int type) {
        return null;
    }
    
    private final androidx.sqlite.db.SimpleSQLiteQuery prepareQuery(kotlin.jvm.functions.Function1<? super com.tamimattafi.mvp.repositories.database.QueryBuilder, com.tamimattafi.mvp.repositories.database.QueryBuilder> query) {
        return null;
    }
    
    private Types() {
        super();
    }
}