package com.example.logging

import android.util.Log

interface ILogger {
    fun logDebug(message: String)
    fun logInfo(message: String)
    fun logWarn(message: String)
    fun logError(message: String)
}

object Logger: ILogger {
    override fun logDebug(message: String) {
        Log.d("Logger", message)
    }

    override fun logInfo(message: String) {
        Log.i("Logger", message)
    }

    override fun logWarn(message: String) {
        Log.w("Logger", message)
    }

    override fun logError(message: String) {
        Log.e("Logger", message)
    }
}
