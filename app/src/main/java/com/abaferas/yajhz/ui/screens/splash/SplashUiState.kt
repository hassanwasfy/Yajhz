package com.abaferas.yajhz.ui.screens.splash

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState


data class SplashUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState