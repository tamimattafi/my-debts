package com.tamimattafi.mydebts.ui.fragments.drawer.base

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.model.repository.DebtsRepository
import com.tamimattafi.mvp.MvpBaseContract
import com.tamimattafi.mvp.navigation.fragment.MvpFragment
import kotlinx.android.synthetic.main.fragment_recycler.*

abstract class BaseFragment(private val type: Int) : MvpFragment<BaseContract.Presenter>(),
    BaseContract.View {

    override var layoutId: Int = R.layout.fragment_recycler
    private lateinit var adapter: MvpBaseContract.Adapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = prepareAdapter()
        presenter?.loadData()
    }

    override fun onSetupPresenter(): BaseContract.Presenter =
        BasePresenter(this, DebtsRepository(type))

    override fun getAdapter(): MvpBaseContract.Adapter = adapter

    override fun bindHolder(holder: BaseContract.Holder) {
        presenter?.bindHolder(holder)
    }

    override fun showMessage(message: String) {
        Toast.makeText(activity!!, message, Toast.LENGTH_LONG).show()
    }

    open fun prepareAdapter(): MvpBaseContract.Adapter =
        BaseAdapter(this).also { it.prepareRecycler() }


    open fun RecyclerView.Adapter<RecyclerView.ViewHolder>.prepareRecycler() {
        recycler.apply {
            layoutManager = LinearLayoutManager(activity)
            itemAnimator = DefaultItemAnimator()
            adapter = this@prepareRecycler
        }
    }
}