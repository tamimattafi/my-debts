package com.tamimattafi.mydebts.ui

import android.os.Bundle
import com.tamimattafi.mydebts.R
import com.tamimattafi.mydebts.ui.fragments.HomeFragment
import com.tamimattafi.mvp.navigation.activity.NavigatorActivity

class MainActivity : NavigatorActivity() {

    override val rootId: Int = R.id.root
    override val layoutId: Int = R.layout.activity_main

    override fun onViewCreated(savedInstanceState: Bundle?) {
        attachBaseFragment(HomeFragment())
    }

    override fun beforeViewCreated(savedInstanceState: Bundle?) {
        super.beforeViewCreated(savedInstanceState)
        theme.applyStyle(R.style.AppTheme, true)
    }

}
