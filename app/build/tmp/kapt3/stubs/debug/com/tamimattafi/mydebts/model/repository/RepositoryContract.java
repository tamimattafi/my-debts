package com.tamimattafi.mydebts.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tamimattafi/mydebts/model/repository/RepositoryContract;", "", "Debts", "app_debug"})
public abstract interface RepositoryContract {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/tamimattafi/mydebts/model/repository/RepositoryContract$Debts;", "Lcom/tamimattafi/mvp/MvpBaseContract$RxListRepository;", "Lcom/tamimattafi/mydebts/model/entities/Debt;", "Lcom/tamimattafi/mvp/MvpBaseContract$Database;", "app_debug"})
    public static abstract interface Debts extends com.tamimattafi.mvp.MvpBaseContract.RxListRepository<com.tamimattafi.mydebts.model.entities.Debt>, com.tamimattafi.mvp.MvpBaseContract.Database<com.tamimattafi.mydebts.model.entities.Debt> {
    }
}