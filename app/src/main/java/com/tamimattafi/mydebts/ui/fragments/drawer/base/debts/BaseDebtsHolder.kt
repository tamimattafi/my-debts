package com.tamimattafi.mydebts.ui.fragments.drawer.base.debts

import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat
import com.tamimattafi.mydebts.R.color.*
import com.tamimattafi.mydebts.common.utils.DateUtils.getTodayTime
import com.tamimattafi.mydebts.ui.fragments.drawer.base.BaseHolder
import kotlinx.android.synthetic.main.item_view_holder_debt.view.*

class BaseDebtsHolder(itemView: View) : BaseHolder(itemView) {

    override fun setDate(date: Long) {
        super.setDate(date)
        itemView.toggle(date == getTodayTime())
    }

    private fun View.toggle(check: Boolean) {
        if (check) {
            card.setBackground(colorCardBackground)
            setTextColors(colorWhite, date, sum, person)
        } else {
            card.setBackground(colorWhite)
            setTextColors(colorBlack, date, sum, person)
        }
    }

    private fun CardView.setBackground(@ColorRes colorRes: Int) {
        setCardBackgroundColor(ResourcesCompat.getColor(context.resources, colorRes, null))
    }

    private fun setTextColors(@ColorRes colorRes: Int, vararg text: TextView) {
        text.forEach {
            it.setTextColor(ResourcesCompat.getColor(it.context.resources, colorRes, null))
        }
    }
}