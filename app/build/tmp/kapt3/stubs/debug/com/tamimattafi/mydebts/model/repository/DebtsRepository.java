package com.tamimattafi.mydebts.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/tamimattafi/mydebts/model/repository/DebtsRepository;", "Lcom/tamimattafi/mvp/repositories/database/DatabaseRepository;", "Lcom/tamimattafi/mydebts/model/entities/Debt;", "Lcom/tamimattafi/mydebts/model/repository/RepositoryContract$Debts;", "type", "", "(I)V", "baseListQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "getDataList", "Lio/reactivex/Flowable;", "", "app_debug"})
public final class DebtsRepository extends com.tamimattafi.mvp.repositories.database.DatabaseRepository<com.tamimattafi.mydebts.model.entities.Debt> implements com.tamimattafi.mydebts.model.repository.RepositoryContract.Debts {
    private final androidx.sqlite.db.SimpleSQLiteQuery baseListQuery = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.tamimattafi.mydebts.model.entities.Debt>> getDataList() {
        return null;
    }
    
    public DebtsRepository(int type) {
        super(null);
    }
    
    public DebtsRepository() {
        super(null);
    }
}