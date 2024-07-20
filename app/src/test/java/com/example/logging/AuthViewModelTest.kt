package com.example.logging

import com.example.logging.auth.AuthViewModel
import org.junit.Assert.*
import org.junit.jupiter.api.Test

class AuthViewModelTest {
    private val viewModel = AuthViewModel()

    @Test
    fun loginSuccess() {
        val result = viewModel.login("user", "pass")
        assertTrue(result)
    }

    @Test
    fun loginFailure() {
        val result = viewModel.login("user", "wrongpass")
        assertFalse(result)
    }
}
