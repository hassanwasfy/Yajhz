package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.ProductCategory
import com.abaferas.yajhz.ui.models.ProductCategoryUiState

fun ProductCategory.toUiState(): ProductCategoryUiState {
    return ProductCategoryUiState(
        id = this.id,
        name = this.name,
        image = this.image,
        active = this.active,
        nameAr = this.nameAr,
        nameEn = this.nameEn
    )
}