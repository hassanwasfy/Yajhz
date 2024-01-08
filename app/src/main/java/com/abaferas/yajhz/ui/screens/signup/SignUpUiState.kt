package com.abaferas.yajhz.ui.screens.signup

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState


data class SignUpUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState