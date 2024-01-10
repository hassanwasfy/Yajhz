package com.abaferas.yajhz.ui.models

data class BaseCategoryUiState (
    val items: List<Data>
){
    data class Data(
        val id: Int,
        val name: String,
        val image: String,
        val active: Int,
        val nameAr: String,
        val nameEn: String
    )
}