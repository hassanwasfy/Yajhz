package com.abaferas.yajhz.ui.models


data class HomeCategoryUiState(
    val items: List<ProductCategoryUiState> = emptyList(),
    val cartCount: Int = 0
)
