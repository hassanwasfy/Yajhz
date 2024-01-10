package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.BaseCategoryDto
import com.abaferas.yajhz.domain.models.BaseCategory

fun BaseCategoryDto.toDomainModel(): BaseCategory {
    return BaseCategory(
        items = this.data.map {
            BaseCategory.Data(
            id = it.id ?: 0,
            name = it.name ?: "",
            image = it.image ?: "",
            active = it.active ?: 0,
            nameAr = it.nameAr ?: "",
            nameEn = it.nameEn ?: ""
        ) }
    )
}