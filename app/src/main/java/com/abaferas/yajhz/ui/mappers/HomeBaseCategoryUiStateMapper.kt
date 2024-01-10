package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.ui.models.HomeBaseCategoryUiState

fun HomeBaseCategory.toUiStateModel(): HomeBaseCategoryUiState {
    return HomeBaseCategoryUiState(
        data = this.data.map { bCat ->
            HomeBaseCategoryUiState.Data(
                id = bCat.id,
                name = bCat.name,
                image = bCat.image,
                active = bCat.active,
                nameAr = bCat.nameAr,
                nameEn = bCat.nameEn
            )
        },
        cartCount = this.cartCount
    )
}