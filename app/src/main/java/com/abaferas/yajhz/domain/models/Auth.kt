package com.abaferas.yajhz.domain.models

data class Auth (
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val image: String,
    val type: Int,
    val status: Int,
    val balance: Int,
    val addresses: List<Address>,
    val token: String
)