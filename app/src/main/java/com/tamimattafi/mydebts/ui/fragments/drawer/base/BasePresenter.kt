package com.tamimattafi.mydebts.ui.fragments.drawer.base

import com.tamimattafi.mydebts.model.entities.Debt
import com.tamimattafi.mvp.MvpBaseContract
import com.tamimattafi.mvp.presenters.recycler.RxRecyclerPresenter

open class BasePresenter(view: BaseContract.View, repository: MvpBaseContract.RxListRepository<Debt>) :
    RxRecyclerPresenter<Debt, BaseContract.Holder, BaseContract.View, MvpBaseContract.RxListRepository<Debt>>(
        view,
        repository
    ), BaseContract.Presenter {

    override fun bindHolder(holder: BaseContract.Holder) {
        view.tryCall { holder.bind() }
    }

    private fun BaseContract.Holder.bind() {
        with(data[listPosition]) {
            setPerson(person)
            setDate(date)
            setSum("$sum $currency")
        }
    }
}