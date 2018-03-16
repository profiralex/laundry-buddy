package com.profir.laundrybuddy.ui.main.fragments

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import com.profir.laundrybuddy.ui.main.viewmodels.MainViewModel

/**
 * Created by profiralexandr on 15/03/2018.
 */
abstract class BaseContentFragment : Fragment() {

    protected val mainVM: MainViewModel by lazy { ViewModelProviders.of(activity!!).get(MainViewModel::class.java) }
    protected abstract val title: String

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        if (isVisibleToUser && isResumed) {
            setTitle()
        }
    }

    private fun setTitle() {
        mainVM.setTitle(title)
    }
}