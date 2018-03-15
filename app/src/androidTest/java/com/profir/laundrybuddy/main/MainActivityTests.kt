package com.profir.laundrybuddy.main

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isEnabled
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.runner.AndroidJUnit4
import com.profir.laundrybuddy.R
import org.junit.Test
import org.junit.runner.RunWith
import com.profir.laundrybuddy.ui.main.activities.MainActivity
import android.support.test.rule.ActivityTestRule
import com.profir.laundrybuddy.utils.getCurrentActivity
import org.junit.Assert
import org.junit.Rule


/**
 * Created by profiralexandr on 15/03/2018.
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTests {
    @get:Rule
    public var activityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testMainActivityIsStarting() {
        Assert.assertEquals(getCurrentActivity()::class.java, MainActivity::class.java)
    }
}