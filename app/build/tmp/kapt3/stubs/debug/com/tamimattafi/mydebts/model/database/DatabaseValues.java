package com.tamimattafi.mydebts.model.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/DatabaseValues;", "", "()V", "Params", "Tables", "app_debug"})
public final class DatabaseValues {
    public static final com.tamimattafi.mydebts.model.database.DatabaseValues INSTANCE = null;
    
    private DatabaseValues() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/DatabaseValues$Tables;", "", "()V", "DEBTS_TABLE", "", "app_debug"})
    public static final class Tables {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DEBTS_TABLE = "debts";
        public static final com.tamimattafi.mydebts.model.database.DatabaseValues.Tables INSTANCE = null;
        
        private Tables() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/DatabaseValues$Params;", "", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "app_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String DATABASE_NAME = "debts-database";
        public static final int DATABASE_VERSION = 1;
        public static final com.tamimattafi.mydebts.model.database.DatabaseValues.Params INSTANCE = null;
        
        private Params() {
            super();
        }
    }
}