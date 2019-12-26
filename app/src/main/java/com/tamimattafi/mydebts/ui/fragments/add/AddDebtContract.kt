package com.tamimattafi.mydebts.ui.fragments.add

import com.tamimattafi.mvp.MvpBaseContract
import java.util.*

interface AddDebtContract {

    interface View : MvpBaseContract.View {
        fun isCreditorNotEmpty(): Boolean
        fun isSumNotEmpty(): Boolean
        fun isDateSet(): Boolean
        fun getIsDebtor(): Boolean
        fun getCreditor(): String
        fun getDate(): Long
        fun getSum(): String
        fun getCurrency(): String
        fun onDebtAdded()
        fun onDebtAddingError()
    }

    interface Presenter : MvpBaseContract.Presenter {
        fun saveDebt()
    }

    interface DateDialog {
        fun setConfirmationListener(onConfirm: (date: Date) -> Unit): DateDialog
        fun setCancelListener(onCancel: () -> Unit): DateDialog
        fun show()
        fun dismiss()
    }

}