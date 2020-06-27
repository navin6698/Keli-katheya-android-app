package com.heluvekatheya.heluvekatheya.ui.login

/**
 * Data validation state of the loginWithEmail form.
 */
data class LoginFormState(val usernameError: Int? = null,
                          val passwordError: Int? = null,
                          val isDataValid: Boolean = false)
