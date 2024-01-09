package com.abaferas.yajhz.ui.screens.home

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState


data class HomeUiState(
    val isLoading: Boolean = false,
    val error: ErrorUiState = ErrorUiState()
) : BaseUiState