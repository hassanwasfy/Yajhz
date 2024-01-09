package com.abaferas.yajhz.ui.models


data class PopularSellerUiState(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String,
    val image: String,
    val logo: String,
    val description: String,
    val distance: String,
    val type: Int,
    val status: Int,
    val lat: String,
    val lng: String,
    val address: String,
    val appointments: String,
    val trending: Int,
    val popular: Int,
    val rate: String,
    val isFavorite: Boolean,
    val categories: List<Category>,
    val token: String,
    val information: Information,
    val productCategories: List<ProductCategoryUiState>
) {
    data class Category(
        val id: Int,
        val name: String,
        val image: String,
        val active: Int
    )
    data class Information(
        val id: Int,
        val identityNumber: String,
        val taxRecord: String,
        val activity: String,
        val nationality: String,
        val vehicleImage: String,
        val vehicleTabletImage: String,
        val vehicleRegistration: String,
        val drivingImage: String
    )
}
