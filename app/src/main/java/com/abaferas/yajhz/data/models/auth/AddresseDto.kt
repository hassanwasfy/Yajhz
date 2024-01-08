package com.abaferas.yajhz.data.models.auth

import com.google.gson.annotations.SerializedName

data class AddresseDto(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("lat")
    val lat: String? = null,
    @SerializedName("lng")
    val lng: String? = null,
    @SerializedName("address")
    val address: Any? = null,
    @SerializedName("street")
    val street: String? = null,
    @SerializedName("building")
    val building: String? = null,
    @SerializedName("apartment")
    val apartment: String? = null,
    @SerializedName("floor")
    val floor: Any? = null,
    @SerializedName("name")
    val name: Any? = null
)

