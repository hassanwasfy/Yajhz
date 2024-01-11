package com.abaferas.yajhz.data.models.categories


import com.google.gson.annotations.SerializedName

data class PopularSellerDto(
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
        val `data`: List<PopularItem> = listOf(),
        @SerializedName("pagination")
        val pagination: Pagination? = Pagination()
    ) {
        data class PopularItem(
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
            val distance: Int? = 0,
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
            val categories: List<Category>? = listOf(),
            @SerializedName("token")
            val token: String? = "",
            @SerializedName("information")
            val information: Information? = null,
            @SerializedName("product_categories")
            val productCategories: List<ProductCategory>? = listOf()
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
                val activity: Int? = 0,
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

            data class ProductCategory(
                @SerializedName("id")
                val id: Int? = 0,
                @SerializedName("name")
                val name: String? = "",
                @SerializedName("active")
                val active: Int? = 0,
                @SerializedName("name_ar")
                val nameAr: String? = "",
                @SerializedName("name_en")
                val nameEn: String? = ""
            )
        }

        data class Pagination(
            @SerializedName("total")
            val total: Int? = 0,
            @SerializedName("count")
            val count: Int? = 0,
            @SerializedName("per_page")
            val perPage: Int? = 0,
            @SerializedName("current_page")
            val currentPage: Int? = 0,
            @SerializedName("total_pages")
            val totalPages: Int? = 0,
            @SerializedName("is_pagination")
            val isPagination: Boolean? = false
        )
    }
}
