package com.abaferas.yajhz.data.models.categories


import com.google.gson.annotations.SerializedName

data class PopularSellerDto(
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("email")
    val email: String? = "",
    @SerializedName("phone")
    val phone: String? = "",
    @SerializedName("image")
    val image: String? = "",
    @SerializedName("logo")
    val logo: String? = "",
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("distance")
    val distance: String? = "",
    @SerializedName("type")
    val type: Int? = 0,
    @SerializedName("status")
    val status: Int? = 0,
    @SerializedName("lat")
    val lat: String? = "",
    @SerializedName("lng")
    val lng: String? = "",
    @SerializedName("address")
    val address: String? = "",
    @SerializedName("appointments")
    val appointments: String? = "",
    @SerializedName("trending")
    val trending: Int? = 0,
    @SerializedName("popular")
    val popular: Int? = 0,
    @SerializedName("rate")
    val rate: String? = "",
    @SerializedName("is_favorite")
    val isFavorite: Boolean? = false,
    @SerializedName("categories")
    val categories: List<Category> = listOf(),
    @SerializedName("token")
    val token: String? = "",
    @SerializedName("information")
    val information: Information? = Information(),
    @SerializedName("product_categories")
    val productCategories: List<ProductCategoryDto> = listOf()
) {
    data class Category(
        @SerializedName("id")
        val id: Int? = 0,
        @SerializedName("name")
        val name: String? = "",
        @SerializedName("image")
        val image: String? = "",
        @SerializedName("active")
        val active: Int? = 0
    )

    data class Information(
        @SerializedName("id")
        val id: Int? = 0,
        @SerializedName("identity_number")
        val identityNumber: String? = "",
        @SerializedName("tax_record")
        val taxRecord: String? = "",
        @SerializedName("activity")
        val activity: String? = null,
        @SerializedName("nationality")
        val nationality: String? = "",
        @SerializedName("vehicle_image")
        val vehicleImage: String? = "",
        @SerializedName("vehicle_tablet_image")
        val vehicleTabletImage: String? = "",
        @SerializedName("vehicle_registration")
        val vehicleRegistration: String? = "",
        @SerializedName("driving_image")
        val drivingImage: String? = ""
    )
}
