package com.profir.laundrybuddy.ui.main.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.MutableLiveData


/**
 * Created by profiralexandr on 16/03/2018.
 */
class MainViewModel : ViewModel() {
    private val _title: MutableLiveData<String> = MutableLiveData()
    val title: LiveData<String> = _title

    fun setTitle(title: String) {
        this._title.value = title
    }
}