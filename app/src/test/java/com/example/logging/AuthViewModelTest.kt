package com.example.logging

import com.example.logging.auth.AuthViewModel
import org.junit.Assert.*
import org.junit.jupiter.api.Test

class AuthViewModelTest {
    private lateinit var viewModel: AuthViewModel

    @Before
    fun setUp() {
        viewModel = AuthViewModel()
    }

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

    @Test
    fun signupSuccess() {
        val result = viewModel.signup("newuser", "newpass")
        assertTrue(result)
    }

    @Test
    fun signupFailure() {
        viewModel.signup("user", "pass") // Existing user
        val result = viewModel.signup("user", "pass")
        assertFalse(result)
    }
}

