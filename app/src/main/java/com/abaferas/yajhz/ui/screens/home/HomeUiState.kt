package com.abaferas.yajhz.ui.screens.home

import com.abaferas.yajhz.ui.base.BaseUiState
import com.abaferas.yajhz.ui.base.ErrorUiState
import com.abaferas.yajhz.ui.models.HomeBaseCategoryUiState
import com.abaferas.yajhz.ui.models.PopularSellerUiState
import com.abaferas.yajhz.ui.models.TrendingSellerUiState


data class HomeUiState(
    val isLoading: Boolean = false,
    val error: ErrorUiState = ErrorUiState(),
    val name: String = "",
    val address: String = "",
    val searchValue: String = "",
    val categoriesList: HomeBaseCategoryUiState = HomeBaseCategoryUiState(),
    val popularList: PopularSellerUiState = PopularSellerUiState(),
    val trendingList: TrendingSellerUiState = TrendingSellerUiState()
) : BaseUiState