package com.tamimattafi.mydebts.model.database.dao

import androidx.room.Dao
import androidx.room.RawQuery
import androidx.sqlite.db.SupportSQLiteQuery
import com.tamimattafi.mydebts.model.entities.Debt
import com.tamimattafi.mvp.repositories.database.BaseDao
import io.reactivex.Flowable

@Dao
interface DebtsDao : BaseDao<Debt> {

    @RawQuery(observedEntities = [Debt::class])
    override fun getRxList(query: SupportSQLiteQuery): Flowable<List<Debt>>

    @RawQuery(observedEntities = [Debt::class])
    override fun getRxItem(query: SupportSQLiteQuery): Flowable<Debt>

}