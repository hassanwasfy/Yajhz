package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.ui.models.BaseCategoryUiState

fun BaseCategory.toUiStateModel(): BaseCategoryUiState {
    return BaseCategoryUiState(
        items = this.items.map { bCat ->
            BaseCategoryUiState.Data(
                id = bCat.id,
                name = bCat.name,
                image = bCat.image,
                active = bCat.active,
                nameAr = bCat.nameAr,
                nameEn = bCat.nameEn
            )
        }
    )
}