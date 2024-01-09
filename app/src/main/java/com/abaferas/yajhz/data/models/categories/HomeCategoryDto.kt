package com.abaferas.yajhz.data.models.categories


import com.google.gson.annotations.SerializedName

data class HomeCategoryDto(
    @SerializedName("data")
    val `data`: List<ProductCategoryDto> = listOf(),
    @SerializedName("cart_count")
    val cartCount: Int? = 0
)
