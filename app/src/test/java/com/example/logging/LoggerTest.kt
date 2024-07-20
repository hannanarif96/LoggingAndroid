package com.example.logging

import com.nhaarman.mockitokotlin2.verify
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito.mock


class LoggerTest {

    @Mock
    private lateinit var mockLogger: Logger

    private lateinit var viewModel: MainViewModel

    private lateinit var factory: MainViewModelFactory

    @BeforeEach
    fun setUp() {
        mockLogger = mock(Logger::class.java)
        viewModel = MainViewModel(mockLogger)
        factory = MainViewModelFactory(mockLogger)
    }


    @Test
    fun `test create MainViewModel`() {
        // Mock ViewModel class
        val viewModelClass: Class<MainViewModel> = MainViewModel::class.java

        // Create ViewModel using factory
        val viewModel = factory.create(viewModelClass)

        // Verify that ViewModel is created with the provided logger
        verify(mockLogger).logDebug("Creating MainViewModel")

        assert(viewModel is MainViewModel)
    }


    @Test
    fun testLogDebug() {
        val result: String = mockLogger.logDebug("This is a debug message")
        Assertions.assertEquals("Debug Log: This is a debug message", result)
    }

    @Test
    fun testLogInfo() {
        val result: String = mockLogger.logInfo("This is an info message")
        Assertions.assertEquals("Info Log: This is an info message", result)
    }

    @Test
    fun testLogWarn() {
        val result: String = mockLogger.logWarn("This is a warn message")
        Assertions.assertEquals("Warn Log: This is a warn message", result)
    }

    @Test
    fun testLogError() {
        val result: String = mockLogger.logError("This is an error message")
        Assertions.assertEquals("Error Log: This is an error message", result)
    }

    @Test
    fun testLogData() {
        val className = "TestClassName"
        viewModel.logData(className)

        Assertions.assertEquals("Debug Log: $className", viewModel.logsList[0])
        Assertions.assertEquals("Info Log: $className", viewModel.logsList[1])
        Assertions.assertEquals("Warn Log: $className", viewModel.logsList[2])
        Assertions.assertEquals("Error Log: $className", viewModel.logsList[3])

        viewModel.logsList.clear()
    }

}
