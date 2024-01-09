package com.abaferas.yajhz.domain.models


import com.google.gson.annotations.SerializedName

data class HomeCategory(
    val items: List<ProductCategory>,
    val cartCount: Int
)
