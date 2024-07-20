package com.example.logging

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.jupiter.api.Test
import org.mockito.Mockito

class NotificationServiceTest {
    private val context = ApplicationProvider.getApplicationContext<Context>()
    private val notificationService = NotificationService(context)

    @Test
    fun sendNotification() {
        val spyService = Mockito.spy(notificationService)
        spyService.sendNotification("Test Title", "Test Content")
        Mockito.verify(spyService).sendNotification("Test Title", "Test Content")
    }
}
