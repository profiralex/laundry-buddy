package com.profir.laundrybuddy.ui.symbols.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.profir.laundrybuddy.R

/**
 * Created by profiralexandr on 15/03/2018.
 */
class SymbolsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_symbols, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Toast.makeText(activity, "Symbols fragment", Toast.LENGTH_SHORT).show()
    }
}