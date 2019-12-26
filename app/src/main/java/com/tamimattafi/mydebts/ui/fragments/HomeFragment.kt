package com.tamimattafi.mydebts.ui.fragments

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.R.id.*
import com.tamimattafi.mydebts.ui.fragments.add.AddDebtFragment
import com.tamimattafi.mydebts.ui.fragments.drawer.debts.DebtsFragment
import com.tamimattafi.mydebts.ui.fragments.drawer.main.MainFragment
import com.tamimattafi.mydebts.ui.fragments.drawer.owes.OwesFragment
import com.tamimattafi.mvp.navigation.fragment.NavigationFragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.toolbar_main.*

class HomeFragment : NavigationFragment() {

    override var layoutId: Int = R.layout.fragment_home
    override var name: String = "fragment-home"

    private var currentItem: MenuItem? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        menu.setOnClickListener {
            drawer.open()
        }

        fab.setOnClickListener {
            navigator.attachFragment(AddDebtFragment())
        }

        navigation.setNavigationItemSelectedListener { menuItem ->
            menuItem.apply {
                toggle()
                handleFragment()
            }
            drawer.close()
            true
        }

        prepareLauncher()
    }

    private fun prepareLauncher() {
        navigation.menu.getItem(0)?.apply {
            toggle()
            handleFragment()
        }
    }

    private fun DrawerLayout.open() {
        openDrawer(GravityCompat.START)
    }

    private fun DrawerLayout.close() {
        closeDrawer(GravityCompat.START)
    }

    private fun MenuItem.handleFragment() {
        when (itemId) {
            main -> MainFragment()
            debts -> DebtsFragment()
            owes -> OwesFragment()
            else -> throw IllegalStateException("Unknown item id: $itemId")
        }.attach()
    }

    private fun MenuItem.toggle() {
        currentItem?.isChecked = false
        isChecked = true
        handleFragment()
        currentItem = this
        this@HomeFragment.title.text = title
    }

    private fun NavigationFragment.attach() {
        this@HomeFragment.childFragmentManager
            .beginTransaction()
            .replace(R.id.frame, this)
            .disallowAddToBackStack()
            .commit()
    }


}

