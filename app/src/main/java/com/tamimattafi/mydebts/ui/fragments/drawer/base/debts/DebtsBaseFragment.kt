package com.tamimattafi.mydebts.ui.fragments.drawer.base.debts

import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseFragment
import com.tamimattafi.mvp.MvpBaseContract

abstract class DebtsBaseFragment(type: Int) : BaseFragment(type) {

    override fun prepareAdapter(): MvpBaseContract.Adapter =
        BaseDebtsAdapter(this).also { it.prepareRecycler() }

}