package com.abaferas.yajhz.domain.models

import com.google.gson.annotations.SerializedName

data class HomeBaseCategory (
val `data`: List<Data> = listOf(),
val cartCount: Int? = 0
) {
    data class Data(
        val id: Int? = 0,
        val name: String? = "",
        val image: String? = "",
        val active: Int? = 0,
        val nameAr: String? = "",
        val nameEn: String? = ""
    )
}
