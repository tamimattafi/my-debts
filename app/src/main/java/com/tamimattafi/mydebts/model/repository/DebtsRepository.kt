package com.tamimattafi.mydebts.model.repository

import com.tamimattafi.mydebts.common.Types.TODAY_DEBTS
import com.tamimattafi.mydebts.common.Types.getTypeQuery
import com.tamimattafi.mydebts.model.database.ApplicationDatabase.Companion.getInstance
import com.tamimattafi.mydebts.model.entities.Debt
import com.tamimattafi.mvp.repositories.database.DatabaseRepository
import io.reactivex.Flowable

class DebtsRepository(type: Int = TODAY_DEBTS) : DatabaseRepository<Debt>(getInstance().debtsDao()),
    RepositoryContract.Debts {

    private val baseListQuery = getTypeQuery(type)

    override fun getDataList(): Flowable<List<Debt>> = super.getRxList(baseListQuery)

}