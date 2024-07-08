package com.example.logging

open class Logger {
    fun logDebug(message: String): String {
        return "Debug Log: $message"
    }

    fun logInfo(message: String): String {
        return "Info Log: $message"
    }

    fun logWarn(message: String): String {
        return "Warn Log: $message"
    }

    fun logError(message: String): String {
        return "Error Log: $message"
    }
}
