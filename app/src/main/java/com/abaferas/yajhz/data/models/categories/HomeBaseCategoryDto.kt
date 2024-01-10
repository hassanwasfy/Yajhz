package com.abaferas.yajhz.data.models.categories


import com.google.gson.annotations.SerializedName

data class HomeBaseCategoryDto(
    @SerializedName("success")
    val success: Boolean? = false,
    @SerializedName("response_code")
    val responseCode: Int? = 0,
    @SerializedName("message")
    val message: String? = "",
    @SerializedName("data")
    val `data`: Data? = Data()
) {
    data class Data(
        @SerializedName("data")
        val `data`: List<Data> = listOf(),
        @SerializedName("cart_count")
        val cartCount: Int? = 0
    ) {
        data class Data(
            @SerializedName("id")
            val id: Int? = 0,
            @SerializedName("name")
            val name: String? = "",
            @SerializedName("image")
            val image: String? = "",
            @SerializedName("active")
            val active: Int? = 0,
            @SerializedName("name_ar")
            val nameAr: String? = "",
            @SerializedName("name_en")
            val nameEn: String? = ""
        )
    }
}