package com.abaferas.yajhz.ui.screens.home

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState
import com.abaferas.yajhz.ui.models.HomeCategoryUiState
import com.abaferas.yajhz.ui.models.PopularSellerUiState


data class HomeUiState(
    val isLoading: Boolean = true,
    val error: ErrorUiState = ErrorUiState(),
    val name: String = "",
    val address: String = "",
    val searchValue: String = "",
    val categoriesList: HomeCategoryUiState = HomeCategoryUiState(),
    val popularList: List<PopularSellerUiState> = emptyList(),
    val trendingList: List<PopularSellerUiState> = emptyList()
) : BaseUiState