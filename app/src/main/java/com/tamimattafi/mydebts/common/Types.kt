package com.tamimattafi.mydebts.common

import androidx.sqlite.db.SimpleSQLiteQuery
import com.tamimattafi.mydebts.common.utils.DateUtils.getTodayTime
import com.tamimattafi.mydebts.model.database.DatabaseValues.Tables.DEBTS_TABLE
import com.tamimattafi.mydebts.model.entities.Debt.Sortables.CREATION_DATE
import com.tamimattafi.mydebts.model.entities.Debt.Sortables.DATE
import com.tamimattafi.mydebts.model.entities.Debt.Sortables.IS_DEBTOR
import com.tamimattafi.mvp.repositories.database.QueryBuilder
import com.tamimattafi.mvp.repositories.database.QueryBuilder.Direction.DESCENDING
import com.tamimattafi.mvp.repositories.database.QueryBuilder.Operators.EQUAL_TO

object Types {

    const val TODAY_DEBTS = 0
    const val MY_DEBTS = 1
    const val PEOPLE_OWE_ME = 2

    fun getTypeQuery(type: Int): SimpleSQLiteQuery = when (type) {

        TODAY_DEBTS -> prepareQuery {
            where(DATE, EQUAL_TO, getTodayTime())
        }

        MY_DEBTS -> prepareQuery {
            where(IS_DEBTOR, EQUAL_TO, 1)
        }

        PEOPLE_OWE_ME -> prepareQuery {
            where(IS_DEBTOR, EQUAL_TO, 0)
        }

        else -> throw IllegalArgumentException("Unknown type: $type")
    }

    private fun prepareQuery(query: QueryBuilder.() -> QueryBuilder): SimpleSQLiteQuery =
        QueryBuilder()
            .selectFrom(DEBTS_TABLE)
            .query()
            .orderBy(CREATION_DATE, DESCENDING)
            .build()


}