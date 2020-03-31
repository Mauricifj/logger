package com.mauricifj.logger

import android.util.Log

/**
 * The simplest logger tool.
 * This object has a builtin tag and methods to log debug, error, info and warning messages.
 */
object Logger {

    private const val TAG = "LOGGER.TAG"

    /**
     * Logs a message in debug level.
     * It uses "LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun debug(message: String) {
        Log.d(TAG, message)
    }

    /**
     * Logs a message and a throwable in error level.
     * It uses "LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     * @param[throwable] optional throwable to be logged
     */
    fun error(message: String, throwable: Throwable? = null) {
        Log.e(TAG, message, throwable)
    }

    /**
     * Logs a message in info level.
     * It uses "LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun info(message: String) {
        Log.i(TAG, message)
    }

    /**
     * Logs a message in warning level.
     * It uses "LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun warning(message: String) {
        Log.w(TAG, message)
    }
}