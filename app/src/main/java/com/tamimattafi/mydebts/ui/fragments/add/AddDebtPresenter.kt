package com.tamimattafi.mydebts.ui.fragments.add

import com.tamimattafi.mydebts.model.entities.Debt
import com.tamimattafi.mydebts.model.repository.RepositoryContract
import com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.Presenter
import com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.View
import com.tamimattafi.mvp.presenters.BasePresenter

class AddDebtPresenter(view: View, repository: RepositoryContract.Debts) :
    BasePresenter<View, RepositoryContract.Debts>(view, repository), Presenter {

    override fun saveDebt() {
        view.tryCall {
            if (isCreditorNotEmpty() && isSumNotEmpty() && isDateSet()) {
                Debt(
                    sum = getSum(),
                    currency = getCurrency(),
                    person = getCreditor(),
                    date = getDate(),
                    isDebtor = getIsDebtor()
                ).insert()
            }
        }
    }

    private fun Debt.insert() {
        repository.insert(this).addSuccessListener {
            view.tryCall { onDebtAdded() }
        }.addFailureListener {
            view.tryCall { onDebtAddingError() }
        }.start()
    }

}