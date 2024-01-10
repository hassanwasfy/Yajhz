package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.BaseCategoryDto
import com.abaferas.yajhz.data.models.categories.HomeBaseCategoryDto
import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.domain.models.HomeBaseCategory

fun HomeBaseCategoryDto.toDomainModel(): HomeBaseCategory {
    return HomeBaseCategory(
        data = this.data?.data?.map {
            HomeBaseCategory.Data(
                id = it.id ?: 0,
                name = it.name ?: "",
                image = it.image ?: "",
                active = it.active ?: 0,
                nameAr = it.nameAr ?: "",
                nameEn = it.nameEn ?: ""
            )
        } ?: emptyList(),
        cartCount = this.data?.cartCount ?: 0
    )
}