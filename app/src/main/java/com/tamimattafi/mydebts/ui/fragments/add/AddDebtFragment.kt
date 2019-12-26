package com.tamimattafi.mydebts.ui.fragments.add

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.common.utils.DateUtils.SIMPLE_DATE_PATTERN
import com.tamimattafi.mydebts.common.utils.DateUtils.toStringDate
import com.tamimattafi.mydebts.model.repository.DebtsRepository
import com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.Presenter
import com.tamimattafi.mydebts.ui.fragments.add.AddDebtContract.View
import com.tamimattafi.mvp.navigation.fragment.MvpFragment
import kotlinx.android.synthetic.main.fragment_add_debt.*
import kotlinx.android.synthetic.main.toolbar_add.*
import java.util.*

class AddDebtFragment : MvpFragment<Presenter>(), View {

    override var layoutId: Int = R.layout.fragment_add_debt
    override var name: String = "fragment-add-debt"

    private var date: Date? = null
        set(value) {
            field = value
            dateLabel.text = value?.toStringDate(SIMPLE_DATE_PATTERN)
                ?: context!!.resources.getString(R.string.date_is_not_selected)
        }

    private val datePicker: AddDebtContract.DateDialog by lazy {
        DatePickerDialog(activity!!).setConfirmationListener { newDate ->
            this.date = newDate
        }
    }

    override fun onViewCreated(view: android.view.View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edit.setOnClickListener {
            datePicker.show()
        }

        save.setOnClickListener {
            presenter?.saveDebt()
        }

        back.setOnClickListener {
            navigator.requestBackPress()
        }

    }

    override fun onSetupPresenter(): Presenter = AddDebtPresenter(this, DebtsRepository())

    override fun isCreditorNotEmpty(): Boolean = creditorLayout.isNotEmpty()

    override fun isSumNotEmpty(): Boolean = sumLayout.isNotEmpty()

    override fun isDateSet(): Boolean = (date != null).also { isSet ->
        if (!isSet) activity!!.resources.getString(R.string.date_is_not_selected).showAsToast()
    }

    override fun getIsDebtor(): Boolean = debtor.isChecked

    override fun getCreditor(): String = creditor.text.toString()

    override fun getDate(): Long = date!!.time

    override fun getSum(): String = sum.text.toString()

    override fun getCurrency(): String = currency.selectedItem.toString()

    override fun onDebtAdded() {
        navigator.requestBackPress()
    }

    override fun onDebtAddingError() {
        activity!!.resources.getString(R.string.add_debt_error).showAsToast()
    }

    override fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }


    private fun TextInputLayout.isNotEmpty(): Boolean = editText?.text?.isEmpty()?.let { isEmpty ->
        error = if (isEmpty) context.resources.getString(R.string.required_field) else null
        isErrorEnabled = isEmpty
        !isEmpty
    } ?: false

    private fun String.showAsToast() {
        Toast.makeText(activity, this, Toast.LENGTH_LONG).show()
    }
}