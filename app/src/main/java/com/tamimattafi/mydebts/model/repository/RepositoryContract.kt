package com.tamimattafi.mydebts.model.repository

import com.tamimattafi.mydebts.model.entities.Debt
import com.tamimattafi.mvp.MvpBaseContract

interface RepositoryContract {
    interface Debts : MvpBaseContract.RxListRepository<Debt>, MvpBaseContract.Database<Debt>
}