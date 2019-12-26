package com.tamimattafi.mydebts.ui.fragments.drawer.base

import android.view.View
import android.widget.TextView
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.common.utils.DateUtils
import com.tamimattafi.mydebts.common.utils.DateUtils.SIMPLE_DATE_PATTERN
import com.tamimattafi.mydebts.common.utils.DateUtils.toStringDate
import com.tamimattafi.mvp.MvpBaseContract
import com.tamimattafi.mvp.adapters.recycler.holders.RecyclerHolder
import kotlinx.android.synthetic.main.item_view_holder_debt.view.*

open class BaseHolder(itemView: View) : RecyclerHolder(itemView), BaseContract.Holder {

    override fun setHolderActionListener(onAction: (action: Int) -> Unit): MvpBaseContract.ListenerHolder {
        itemView.apply {
            setOnLongClickListener {
                card.isChecked = !card.isChecked
                true
            }
        }
        return super.setHolderActionListener(onAction)
    }

    override fun setDate(date: Long) {
        itemView.date.attachDate(date)
    }

    override fun setSum(sum: String) {
        itemView.sum.text = sum
    }

    override fun setPerson(person: String) {
        itemView.person.text = person
    }

    private fun TextView.attachDate(date: Long) {
        text = StringBuilder().apply {
            append(context.resources.getText(R.string.until))
            append(" ")
            append(
                if (date == DateUtils.getTodayTime()) context.resources.getText(R.string.today)
                else date.toStringDate(SIMPLE_DATE_PATTERN)
            )
        }
    }

}