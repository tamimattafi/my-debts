package com.tamimattafi.mydebts.ui.fragments.drawer.base.debts

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.common.utils.AppUtils.inflate
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseAdapter
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract

class BaseDebtsAdapter(view: BaseContract.View) : BaseAdapter(view) {

    override fun getItemHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        BaseDebtsHolder(parent.inflate(R.layout.item_view_holder_debt))


}