package com.tamimattafi.mydebts.ui.fragments.drawer.base

import android.view.ViewGroup
import com.tamimattafi.mydebts.common.utils.AppUtils.inflate
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.mydebts.R
import com.tamimattafi.mvp.adapters.recycler.RecyclerAdapter
import com.tamimattafi.mvp.adapters.recycler.holders.empty.UnbindableHolder

open class BaseAdapter(view: BaseContract.View) : RecyclerAdapter<BaseContract.Holder>(view) {

    override fun getEmptyHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        UnbindableHolder(parent.inflate(R.layout.item_view_holder_empty))

    override fun getItemHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        BaseHolder(parent.inflate(R.layout.item_view_holder_debt))

    override fun getLoadingHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        UnbindableHolder(parent.inflate(R.layout.item_view_holder_loading))

}