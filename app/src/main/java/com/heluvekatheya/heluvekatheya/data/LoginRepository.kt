package com.heluvekatheya.heluvekatheya.data

import com.heluvekatheya.heluvekatheya.data.model.LoggedInUser

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an com-memory cache of loginWithEmail status and user credentials information.
 */

class LoginRepository(val dataSource: LoginDataSource) {

    // com-memory cache of the loggedInUser object
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        user = null
    }

    fun logout() {
        user = null
        dataSource.logout()
    }

    fun login(username: String, password: String): Result<LoggedInUser> {
        // handle loginWithEmail
        val result = dataSource.login(username, password)

        if (result is Result.Success) {
            setLoggedInUser(result.data)
        }

        return result
    }

    fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // If user credentials will be cached com local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }
}
