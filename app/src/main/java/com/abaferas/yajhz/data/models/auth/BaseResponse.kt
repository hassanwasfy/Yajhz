package com.abaferas.yajhz.data.models.auth

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("response_code")
    val responseCode: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: T
)

