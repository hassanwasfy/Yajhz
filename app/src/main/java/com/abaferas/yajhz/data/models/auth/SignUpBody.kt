package com.abaferas.yajhz.data.models.auth

import com.google.gson.annotations.SerializedName

data class SignUpBody(
    @SerializedName("name")
    val name: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("device_token")
    val deviceToken: String
)
