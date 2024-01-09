package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.HomeCategoryDto
import com.abaferas.yajhz.domain.models.HomeCategory

fun HomeCategoryDto.toDomainModel(): HomeCategory {
    return HomeCategory(
        items = this.data.map {
            it.toDomainModel()
        },
        cartCount = this.cartCount ?: 0
    )
}