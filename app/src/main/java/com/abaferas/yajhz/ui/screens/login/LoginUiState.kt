package com.abaferas.yajhz.ui.screens.login

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState


data class LoginUiState(
    val isLoading: Boolean = true,
    val isLogging: Boolean = false,
    val error: ErrorUiState = ErrorUiState(),
    val email: String = "",
    val emailError: ErrorUiState = ErrorUiState(),
    val password: String = "",
    val passwordError: ErrorUiState = ErrorUiState(),
) : BaseUiState