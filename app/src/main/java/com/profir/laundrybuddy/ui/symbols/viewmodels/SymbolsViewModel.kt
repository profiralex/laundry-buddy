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
                // Wash
                Symbol(R.string.wash_normal_title, R.string.wash_normal_description, R.drawable.ic_wash_normal),
                Symbol(R.string.wash_permanent_press_title, R.string.wash_permanent_press_description, R.drawable.ic_wash_permanent_press),
                Symbol(R.string.wash_delicate_title, R.string.wash_delicate_description, R.drawable.ic_wash_delicate),
                Symbol(R.string.wash_hand_title, R.string.wash_hand_description, R.drawable.ic_wash_hand),
                Symbol(R.string.wash_no_title, R.string.wash_no_description, R.drawable.ic_wash_no),
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
                Symbol(R.string.wash_temperature_95_title, R.string.wash_temperature_95_description, R.drawable.ic_wash_temperature_95),

                // Tumble dry
                Symbol(R.string.tumble_dry_normal_title, R.string.tumble_dry_normal_description, R.drawable.ic_tumble_dry_normal),
                Symbol(R.string.tumble_dry_heat_low_title, R.string.tumble_dry_heat_low_description, R.drawable.ic_tumble_dry_heat_low),
                Symbol(R.string.tumble_dry_heat_medium_title, R.string.tumble_dry_heat_medium_description, R.drawable.ic_tumble_dry_heat_medium),
                Symbol(R.string.tumble_dry_heat_high_title, R.string.tumble_dry_heat_high_description, R.drawable.ic_tumble_dry_heat_high),
                Symbol(R.string.tumble_dry_heat_no_title, R.string.tumble_dry_heat_no_description, R.drawable.ic_tumble_dry_heat_no),
                Symbol(R.string.tumble_dry_permanent_press_title, R.string.tumble_dry_permanent_press_description, R.drawable.ic_tumble_dry_permanent_press),
                Symbol(R.string.tumble_dry_gentle_title, R.string.tumble_dry_gentle_description, R.drawable.ic_tumble_dry_gentle),
                Symbol(R.string.tumble_dry_no_title, R.string.tumble_dry_no_description, R.drawable.ic_tumble_dry_not),

                // Dry
                Symbol(R.string.dry_no_title, R.string.dry_no_description, R.drawable.ic_dry_no),
                Symbol(R.string.dry_line_title, R.string.dry_line_description, R.drawable.ic_dry_line),
                Symbol(R.string.dry_drip_title, R.string.dry_drip_description, R.drawable.ic_dry_drip),
                Symbol(R.string.dry_flat_title, R.string.dry_flat_description, R.drawable.ic_dry_flat),
                Symbol(R.string.dry_shade_title, R.string.dry_shade_description, R.drawable.ic_dry_shade),

                // Wring
                Symbol(R.string.dry_wring_no_title, R.string.dry_wring_no_description, R.drawable.ic_dry_wring_no),

                // Iron
                Symbol(R.string.iron_normal_title, R.string.iron_normal_description, R.drawable.ic_iron_normal),
                Symbol(R.string.iron_temperature_low_title, R.string.iron_temperature_low_description, R.drawable.ic_iron_temperature_low),
                Symbol(R.string.iron_temperature_medium_title, R.string.iron_temperature_medium_description, R.drawable.ic_iron_temperature_medium),
                Symbol(R.string.iron_temperature_high_title, R.string.iron_temperature_high_description, R.drawable.ic_iron_temperature_high),
                Symbol(R.string.iron_steam_no_title, R.string.iron_steam_no_description, R.drawable.ic_iron_steam_no),
                Symbol(R.string.iron_no_title, R.string.iron_no_description, R.drawable.ic_iron_no)
        )
    }
}