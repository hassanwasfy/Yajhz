package com.abaferas.yajhz.data.models.auth

import com.google.gson.annotations.SerializedName

data class LoginBody (
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("device_token")
    val deviceToken: String
)