package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.ProductCategoryDto
import com.abaferas.yajhz.domain.models.ProductCategory

fun ProductCategoryDto.toDomainModel(): ProductCategory {
    return ProductCategory(
        id = this.id ?: 0,
        name = this.name ?: "",
        image = this.image ?: "",
        active = this.active ?: 0,
        nameAr = this.nameAr ?: "",
        nameEn = this.nameEn ?: ""
    )
}

fun List<ProductCategoryDto>.toDomain(): List<ProductCategory>{
    return this.map { it.toDomainModel() }
}