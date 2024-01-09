package com.abaferas.yajhz.domain.models

data class Address (
val id: Int,
val lat: String,
val lng: String,
val address: String,
val street: String,
val building: String,
val apartment: String,
val floor: Int,
val name: String
)