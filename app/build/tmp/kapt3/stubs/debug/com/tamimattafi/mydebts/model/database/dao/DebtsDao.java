package com.tamimattafi.mydebts.model.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/dao/DebtsDao;", "Lcom/tamimattafi/mvp/repositories/database/BaseDao;", "Lcom/tamimattafi/mydebts/model/entities/Debt;", "getRxItem", "Lio/reactivex/Flowable;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getRxList", "", "app_debug"})
public abstract interface DebtsDao extends com.tamimattafi.mvp.repositories.database.BaseDao<com.tamimattafi.mydebts.model.entities.Debt> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.tamimattafi.mydebts.model.entities.Debt.class})
    @java.lang.Override()
    public abstract io.reactivex.Flowable<java.util.List<com.tamimattafi.mydebts.model.entities.Debt>> getRxList(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.tamimattafi.mydebts.model.entities.Debt.class})
    @java.lang.Override()
    public abstract io.reactivex.Flowable<com.tamimattafi.mydebts.model.entities.Debt> getRxItem(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SupportSQLiteQuery query);
}