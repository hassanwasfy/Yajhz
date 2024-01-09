package com.abaferas.yajhz.ui.models

data class AddressUiState (
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