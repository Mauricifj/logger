package com.mauricifj.logger

import android.util.Log

object Logger {

    private const val TAG = "LOGGER.TAG"

    fun error(message: String, throwable: Throwable? = null) {
        Log.e(TAG, message, throwable)
    }

    fun info(message: String) {
        Log.i(TAG, message)
    }

    fun warning(message: String) {
        Log.w(TAG, message)
    }
}