package com.example.logging

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class LoggerTest {

    @Mock
    private lateinit var mockLogger: ILogger
    private val testMessage = "Test message"

    @BeforeEach
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun `test logDebug`() {
        `when`(mockLogger.logDebug(testMessage)).then {
        }

        mockLogger.logDebug(testMessage)
        verify(mockLogger).logDebug(testMessage)
    }

    @Test
    fun `test logInfo`() {
        `when`(mockLogger.logInfo(testMessage)).then {
        }

        mockLogger.logInfo(testMessage)
        verify(mockLogger).logInfo(testMessage)
    }

    @Test
    fun `test logWarn`() {
        `when`(mockLogger.logWarn(testMessage)).then {
        }

        mockLogger.logWarn(testMessage)
        verify(mockLogger).logWarn(testMessage)
    }

    @Test
    fun `test logError`() {
        `when`(mockLogger.logError(testMessage)).then {
        }

        mockLogger.logError(testMessage)
        verify(mockLogger).logError(testMessage)

    }
}
