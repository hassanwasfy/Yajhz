package com.abaferas.yajhz.ui.screens.login

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState


data class LoginUiState(
    val isLoading: Boolean = true,
    val isLogging: Boolean = false,
    val error: ErrorUiState = ErrorUiState(),
    val email: String = "hassanwasfy@google.com",
    val emailError: ErrorUiState = ErrorUiState(),
    val password: String = "12345678",
    val passwordError: ErrorUiState = ErrorUiState(),
) : BaseUiState