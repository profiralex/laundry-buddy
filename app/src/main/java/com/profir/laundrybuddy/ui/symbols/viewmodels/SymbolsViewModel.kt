package com.profir.laundrybuddy.ui.symbols.viewmodels

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.profir.laundrybuddy.R
import com.profir.laundrybuddy.ui.symbols.models.Symbol

/**
 * Created by profiralexandr on 17/03/2018.
 */
class SymbolsViewModel : ViewModel() {
    private val _symbols: MutableLiveData<List<Symbol>> = MutableLiveData()
    val symbols: LiveData<List<Symbol>> = _symbols

    fun loadSymbols() {
        _symbols.value = listOf(
                Symbol(R.string.wash_normal_title, R.string.wash_normal_description, R.drawable.ic_wash_normal),
                Symbol(R.string.wash_delicate_title, R.string.wash_delicate_description, R.drawable.ic_wash_delicate),
                Symbol(R.string.wash_hand_title, R.string.wash_hand_description, R.drawable.ic_wash_hand),
                Symbol(R.string.wash_no_title, R.string.wash_no_description, R.drawable.ic_wash_no),
                Symbol(R.string.wash_permanent_press_title, R.string.wash_permanent_press_description, R.drawable.ic_wash_permanent_press),
                Symbol(R.string.wash_temperature_30_celsius_title, R.string.wash_temperature_30_celsius_description, R.drawable.ic_wash_temperature_30_celsius),
                Symbol(R.string.wash_temperature_30_title, R.string.wash_temperature_30_description, R.drawable.ic_wash_temperature_30),
                Symbol(R.string.wash_temperature_40_celsius_title, R.string.wash_temperature_40_celsius_description, R.drawable.ic_wash_temperature_40_celsius),
                Symbol(R.string.wash_temperature_40_title, R.string.wash_temperature_40_description, R.drawable.ic_wash_temperature_40),
                Symbol(R.string.wash_temperature_50_celsius_title, R.string.wash_temperature_50_celsius_description, R.drawable.ic_wash_temperature_50_celsius),
                Symbol(R.string.wash_temperature_50_title, R.string.wash_temperature_50_description, R.drawable.ic_wash_temperature_50),
                Symbol(R.string.wash_temperature_60_celsius_title, R.string.wash_temperature_60_celsius_description, R.drawable.ic_wash_temperature_60_celsius),
                Symbol(R.string.wash_temperature_60_title, R.string.wash_temperature_60_description, R.drawable.ic_wash_temperature_60),
                Symbol(R.string.wash_temperature_70_celsius_title, R.string.wash_temperature_70_celsius_description, R.drawable.ic_wash_temperature_70_celsius),
                Symbol(R.string.wash_temperature_70_title, R.string.wash_temperature_70_description, R.drawable.ic_wash_temperature_70),
                Symbol(R.string.wash_temperature_95_celsius_title, R.string.wash_temperature_95_celsius_description, R.drawable.ic_wash_temperature_95_celsius),
                Symbol(R.string.wash_temperature_95_title, R.string.wash_temperature_95_description, R.drawable.ic_wash_temperature_95)
        )
    }
}