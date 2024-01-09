package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.HomeCategory
import com.abaferas.yajhz.ui.models.HomeCategoryUiState

fun HomeCategory.toUiState(): HomeCategoryUiState {
    return HomeCategoryUiState(
        items = this.items.map {
            it.toUiState()
        },
        cartCount = this.cartCount ?: 0
    )
}