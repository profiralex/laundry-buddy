package com.profir.laundrybuddy.utils

/**
 * Created by profiralexandr on 06/03/2018.
 */

class NativeUtils {
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

}
