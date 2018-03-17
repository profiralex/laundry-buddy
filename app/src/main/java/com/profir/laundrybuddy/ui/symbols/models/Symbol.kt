package com.profir.laundrybuddy.ui.symbols.models

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes

/**
 * Created by profiralexandr on 17/03/2018.
 */
data class Symbol(@StringRes val titleRes: Int,
                  @StringRes val descriptionRes: Int,
                  @DrawableRes val iconRes: Int)
