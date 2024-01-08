package com.abaferas.yajhz.data.models.auth

import com.google.gson.annotations.SerializedName

data class AuthDto(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("phone")
    val phone: String? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("type")
    val type: Int? = null,
    @SerializedName("status")
    val status: Int? = null,
    @SerializedName("balance")
    val balance: Int? = null,
    @SerializedName("addresses")
    val addresses: List<AddresseDto>? = null,
    @SerializedName("token")
    val token: String? = null
)