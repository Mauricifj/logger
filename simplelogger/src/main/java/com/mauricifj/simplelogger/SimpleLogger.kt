package com.mauricifj.simplelogger

import android.util.Log

/**
 * The simplest logger tool.
 * <p>
 * This object has a builtin tag and methods to log debug, error, info and warning messages.
 */
object SimpleLogger {

    private const val TAG = "SIMPLE.LOGGER.TAG"

    /**
     * Logs a message in debug level.
     * <p>
     * It uses "SIMPLE.LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun debug(message: String) {
        Log.d(TAG, message)
    }

    /**
     * Logs a message and an optional throwable in error level.
     * <p>
     * It uses "SIMPLE.LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     * @param[throwable] optional throwable to be logged
     */
    fun error(message: String, throwable: Throwable? = null) {
        Log.e(TAG, message, throwable)
    }

    /**
     * Logs a message in info level.
     * <p>
     * It uses "SIMPLE.LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun info(message: String) {
        Log.i(TAG, message)
    }

    /**
     * Logs a message in warning level.
     * <p>
     * It uses "SIMPLE.LOGGER.TAG" as its tag.
     *
     * @param[message] message to be logged
     */
    fun warning(message: String) {
        Log.w(TAG, message)
    }
}