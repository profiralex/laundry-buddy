package com.profir.laundrybuddy.utils

import android.app.Activity
import android.support.test.InstrumentationRegistry
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry
import android.support.test.runner.lifecycle.Stage

/**
 * Created by profiralexandr on 15/03/2018.
 */
fun getCurrentActivity(): Activity {
    var currentActivity: Activity? = null
    InstrumentationRegistry.getInstrumentation().runOnMainSync {
        val resumedActivities = ActivityLifecycleMonitorRegistry.getInstance().getActivitiesInStage(Stage.RESUMED)
        currentActivity = resumedActivities.iterator().next()
    }
    return currentActivity!!
}

