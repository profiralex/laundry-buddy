package com.profir.laundrybuddy.ui.about.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.profir.laundrybuddy.R
import com.profir.laundrybuddy.ui.main.fragments.BaseContentFragment

/**
 * Created by profiralexandr on 15/03/2018.
 */
class AboutFragment : BaseContentFragment() {
    override val title: String by lazy { getString(R.string.about) }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_about, container, false)
    }
}