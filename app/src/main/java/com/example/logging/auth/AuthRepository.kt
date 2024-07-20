package com.example.logging.auth

class AuthRepository {
    fun login(username: String, password: String): Boolean {
        // Simulate login logic...
        return username == "user" && password == "pass"
    }
}
