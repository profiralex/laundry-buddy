package com.profir.laundrybuddy.ui.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.profir.laundrybuddy.ui.easyar.EasyARActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, EasyARActivity::class.java))
    }
}
