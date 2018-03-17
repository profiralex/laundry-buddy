package com.profir.laundrybuddy

import android.app.Application
import timber.log.Timber

/**
 * Created by profiralexandr on 17/03/2018.
 */
class LaundryBuddyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}