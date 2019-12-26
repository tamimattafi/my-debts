package com.tamimattafi.mydebts.ui.fragments.drawer.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseAdapter
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseContract
import com.tamimattafi.mvp.adapters.recycler.holders.empty.UnbindableHolder
import com.tamimattafi.mydebts.common.utils.AppUtils.inflate

class MainAdapter(view: BaseContract.View) : BaseAdapter(view) {

    private val headersCount = 1

    override fun getItemCount(): Int {
        return if (dataCount > 0) super.getItemCount() + headersCount
        else super.getItemCount()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == TYPE_HEADER) UnbindableHolder(parent.inflate(R.layout.item_view_holder_main_header))
        else super.onCreateViewHolder(parent, viewType)
    }

    override fun getListPosition(adapterPosition: Int): Int {
        return super.getListPosition(adapterPosition) - headersCount
    }

    override fun getItemViewType(position: Int): Int {
        return if (dataCount > 0 && position == 0) TYPE_HEADER
        else super.getItemViewType(position)
    }

    companion object {
        const val TYPE_HEADER = 4
    }
}