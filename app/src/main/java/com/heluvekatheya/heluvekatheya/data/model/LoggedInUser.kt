package com.heluvekatheya.heluvekatheya.data.model

/**
 * Data class that captures user information for logged com users retrieved from LoginRepository
 */
data class LoggedInUser(
        val userId: String,
        val displayName: String,
        val email: String
)
