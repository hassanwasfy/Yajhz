package com.abaferas.yajhz.ui.screens.signup

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState

data class SignUpUiState(
    val isLoading: Boolean = true,
    val isLogging: Boolean = false,
    val error: ErrorUiState = ErrorUiState(),
    val name: String = "",
    val nameError: ErrorUiState = ErrorUiState(),
    val email: String = "",
    val emailError: ErrorUiState = ErrorUiState(),
    val phoneNumber: String = "",
    val phoneError: ErrorUiState = ErrorUiState(),
    val password: String = "",
    val passwordError: ErrorUiState = ErrorUiState(),
    val confirmPassword: String = "",
    val confirmError: ErrorUiState = ErrorUiState(),
): BaseUiState