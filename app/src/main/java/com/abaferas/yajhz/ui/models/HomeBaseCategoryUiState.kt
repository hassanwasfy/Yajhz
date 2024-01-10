package com.abaferas.yajhz.ui.models

data class HomeBaseCategoryUiState (
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
