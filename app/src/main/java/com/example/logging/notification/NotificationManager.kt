package com.example.logging.notification

import android.content.Context

class NotificationManager(private val context: Context) {
    private val notificationService = NotificationService(context)

    fun notifyTaskDue(taskName: String) {
        notificationService.sendNotification("Task Due", "The task '$taskName' is due.")
    }
}
