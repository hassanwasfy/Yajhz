package com.abaferas.yajhz.ui.models

data class ClientUiState (
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val image: String,
    val type: Int,
    val status: Int,
    val balance: String,
    val addresses: List<AddressUiState>,
    val token: String
)
