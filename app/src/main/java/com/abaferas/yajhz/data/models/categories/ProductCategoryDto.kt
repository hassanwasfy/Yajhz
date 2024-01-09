package com.abaferas.yajhz.data.models.categories

import com.google.gson.annotations.SerializedName

data class ProductCategoryDto(
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("image")
    val image: String? = "",
    @SerializedName("active")
    val active: Int? = 0,
    @SerializedName("name_ar")
    val nameAr: String? = "",
    @SerializedName("name_en")
    val nameEn: String? = ""
)
