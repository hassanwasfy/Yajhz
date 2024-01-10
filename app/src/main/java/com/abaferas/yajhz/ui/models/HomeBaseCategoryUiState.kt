package com.abaferas.yajhz.ui.models

data class HomeBaseCategoryUiState (
    val `data`: List<Data> = emptyList(),
    val cartCount: Int = 0
) {
    data class Data(
        val id: Int,
        val name: String,
        val image: String,
        val active: Int,
        val nameAr: String,
        val nameEn: String
    )
}
