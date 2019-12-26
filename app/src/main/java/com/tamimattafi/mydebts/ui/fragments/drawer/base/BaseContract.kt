package com.tamimattafi.mydebts.ui.fragments.drawer.base

import com.tamimattafi.mvp.MvpBaseContract

interface BaseContract {

    interface Holder : MvpBaseContract.Holder {
        fun setDate(date: Long)
        fun setSum(sum: String)
        fun setPerson(person: String)
    }

    interface Presenter : MvpBaseContract.RecyclerPresenter<Holder>

    interface View : MvpBaseContract.ListenerView<Holder> {
        override fun onHolderAction(holder: Holder?, action: Int) {}
        override fun onHolderClick(holder: Holder) {}
    }

}