package com.profir.laundrybuddy.ui.symbols.fragments

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.profir.laundrybuddy.R
import com.profir.laundrybuddy.ui.main.fragments.BaseContentFragment
import com.profir.laundrybuddy.ui.symbols.models.Symbol
import com.profir.laundrybuddy.ui.symbols.viewmodels.SymbolsViewModel
import com.profir.laundrybuddy.ui.symbols.widgets.SymbolItem
import com.profir.laundrybuddy.ui.symbols.widgets.SymbolItemViewHolder
import kotlinx.android.synthetic.main.fragment_symbols.*
import timber.log.Timber

/**
 * Created by profiralexandr on 15/03/2018.
 */
class SymbolsFragment : BaseContentFragment() {
    private val symbolsVM by lazy { ViewModelProviders.of(activity!!).get(SymbolsViewModel::class.java) }
    private val symbolsAdapter = ItemAdapter<SymbolItem>()
    private val fastAdapter: FastAdapter<SymbolItem> = FastAdapter.with(symbolsAdapter)

    override val title: String by lazy { getString(R.string.all_symbols) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        symbolsVM.symbols.observe(this, Observer {
            it?.apply {
                symbolsAdapter.set(it.map { SymbolItem(it) })
                fastAdapter.notifyAdapterDataSetChanged()
            }
        })
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        return inflater.inflate(R.layout.fragment_symbols, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        symbolsFragmentRV.layoutManager = LinearLayoutManager(activity)
        symbolsFragmentRV.adapter = fastAdapter

        symbolsVM.loadSymbols()
    }
}