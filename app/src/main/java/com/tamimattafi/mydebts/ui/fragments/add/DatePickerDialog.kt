package com.tamimattafi.mydebts.ui.fragments.add

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.Window
import android.widget.DatePicker
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.common.utils.DateUtils.keepDayOnly
import kotlinx.android.synthetic.main.dialog_date.view.*
import java.util.*
import java.util.Calendar.*

class DatePickerDialog(activity: Activity) : AddDebtContract.DateDialog {

    @SuppressLint("InflateParams")
    private val view = LayoutInflater.from(activity).inflate(R.layout.dialog_date, null)
    private val dialog =
        AlertDialog.Builder(activity).setCancelable(true).setView(view).create().apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

    private var onConfirm: ((date: Date) -> Unit)? = null
    private var onCancel: (() -> Unit)? = null

    init {
        with(view) {
            cancel.setOnClickListener {
                dialog.cancel()
            }

            confirm.setOnClickListener {
                onConfirm?.invoke(picker.getDate())
                dismiss()
            }
        }
    }

    override fun setConfirmationListener(onConfirm: (date: Date) -> Unit): AddDebtContract.DateDialog =
        this.also { it.onConfirm = onConfirm }

    override fun setCancelListener(onCancel: () -> Unit): AddDebtContract.DateDialog =
        this.also { it.onCancel = onCancel }

    override fun show() {
        dialog.show()

    }

    override fun dismiss() {
        dialog.dismiss()
    }

    private fun DatePicker.getDate(): Date = getInstance().apply {
        set(YEAR, year)
        set(MONTH, month)
        set(DAY_OF_MONTH, dayOfMonth)
        keepDayOnly()
    }.time

}