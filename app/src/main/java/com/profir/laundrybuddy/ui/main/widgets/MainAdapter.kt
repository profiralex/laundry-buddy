package com.profir.laundrybuddy.ui.main.widgets

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.profir.laundrybuddy.ui.about.fragments.AboutFragment
import com.profir.laundrybuddy.ui.symbols.fragments.SymbolsFragment

/**
 * Created by profiralexandr on 16/03/2018.
 */
class MainAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SymbolsFragment()
            1 -> SymbolsFragment()
            2 -> AboutFragment()
            else -> throw IllegalArgumentException("Page not handled")
        }
    }

    override fun getCount(): Int {
        return 3
    }
}