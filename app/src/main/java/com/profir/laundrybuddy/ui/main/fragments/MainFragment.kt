package com.profir.laundrybuddy.ui.main.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.profir.laundrybuddy.R
import com.profir.laundrybuddy.ui.main.widgets.MainAdapter
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Created by profiralexandr on 07/03/2018.
 */
class MainFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mainFragmentVP.setOnTouchListener { _, _ -> true }
        mainFragmentVP.adapter = MainAdapter(childFragmentManager)
        mainFragmentVP.offscreenPageLimit = 3

        mainFragmentBottomNV.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mainMenuList -> mainFragmentVP.currentItem = 0
                R.id.mainMenuScan -> mainFragmentVP.currentItem = 1
                R.id.mainMenuAbout -> mainFragmentVP.currentItem = 2
            }
            true
        }
    }
}