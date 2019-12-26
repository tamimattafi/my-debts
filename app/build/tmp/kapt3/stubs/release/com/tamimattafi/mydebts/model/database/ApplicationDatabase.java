package com.tamimattafi.mydebts.model.database;

import java.lang.System;

@androidx.room.Database(entities = {com.tamimattafi.mydebts.model.entities.Debt.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/ApplicationDatabase;", "Landroidx/room/RoomDatabase;", "()V", "debtsDao", "Lcom/tamimattafi/mydebts/model/database/dao/DebtsDao;", "Companion", "app_release"})
public abstract class ApplicationDatabase extends androidx.room.RoomDatabase {
    private static com.tamimattafi.mydebts.model.database.ApplicationDatabase instance;
    public static final com.tamimattafi.mydebts.model.database.ApplicationDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.tamimattafi.mydebts.model.database.dao.DebtsDao debtsDao();
    
    public ApplicationDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/tamimattafi/mydebts/model/database/ApplicationDatabase$Companion;", "", "()V", "instance", "Lcom/tamimattafi/mydebts/model/database/ApplicationDatabase;", "getInstance", "init", "", "context", "Landroid/content/Context;", "app_release"})
    public static final class Companion {
        
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tamimattafi.mydebts.model.database.ApplicationDatabase getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}