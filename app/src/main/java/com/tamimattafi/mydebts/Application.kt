package com.tamimattafi.mydebts

import android.app.Application
import com.tamimattafi.mydebts.model.database.ApplicationDatabase

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        ApplicationDatabase.init(this)
    }

}