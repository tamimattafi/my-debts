package com.tamimattafi.mydebts.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tamimattafi.mydebts.model.database.DatabaseValues.Params.DATABASE_NAME
import com.tamimattafi.mydebts.model.database.DatabaseValues.Params.DATABASE_VERSION
import com.tamimattafi.mydebts.model.database.dao.DebtsDao
import com.tamimattafi.mydebts.model.entities.Debt

@Database(entities = [Debt::class], version = DATABASE_VERSION)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun debtsDao(): DebtsDao

    companion object {

        private lateinit var instance: ApplicationDatabase

        fun init(context: Context) {
            instance = Room.databaseBuilder(context, ApplicationDatabase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()
        }

        fun getInstance(): ApplicationDatabase = instance

    }
}
