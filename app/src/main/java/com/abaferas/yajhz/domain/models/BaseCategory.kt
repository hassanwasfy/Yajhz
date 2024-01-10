package com.abaferas.yajhz.domain.models

data class BaseCategory (
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