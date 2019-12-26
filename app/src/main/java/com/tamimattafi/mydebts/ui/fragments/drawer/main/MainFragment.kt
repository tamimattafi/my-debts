package com.tamimattafi.mydebts.ui.fragments.drawer.main


import com.tamimattafi.mydebts.common.Types.TODAY_DEBTS
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseFragment
import com.tamimattafi.mvp.MvpBaseContract

class MainFragment : BaseFragment(TODAY_DEBTS) {
    override var name: String = "fragment-main"

    override fun prepareAdapter(): MvpBaseContract.Adapter =
        MainAdapter(this).also { it.prepareRecycler() }
}