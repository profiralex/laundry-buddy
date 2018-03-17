package com.profir.laundrybuddy.ui.symbols.widgets

import android.view.View
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.items.AbstractItem
import com.profir.laundrybuddy.R
import com.profir.laundrybuddy.ui.symbols.models.Symbol
import kotlinx.android.synthetic.main.fragment_symbols_item.view.*

/**
 * Created by profiralexandr on 17/03/2018.
 */
class SymbolItem(val symbol: Symbol) : AbstractItem<SymbolItem, SymbolItemViewHolder>() {
    override fun getType(): Int = R.id.fastadapter_symbol_item

    override fun getLayoutRes(): Int = R.layout.fragment_symbols_item

    override fun getViewHolder(v: View): SymbolItemViewHolder = SymbolItemViewHolder(v)
}

class SymbolItemViewHolder(itemView: View) : FastAdapter.ViewHolder<SymbolItem>(itemView) {

    override fun bindView(item: SymbolItem, payloads: List<Any>) {
        itemView.fragmentSymbolsItemIconIV.setImageResource(item.symbol.iconRes)
        itemView.fragmentSymbolsItemTitleTV.setText(item.symbol.titleRes)
        itemView.fragmentSymbolsItemDescriptionTV.setText(item.symbol.descriptionRes)
    }

    override fun unbindView(item: SymbolItem) {
    }
}