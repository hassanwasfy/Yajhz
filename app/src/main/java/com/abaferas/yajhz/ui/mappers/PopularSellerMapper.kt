package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.PopularSeller
import com.abaferas.yajhz.ui.models.PopularSellerUiState

fun PopularSeller.toUiState(): PopularSellerUiState {
    return PopularSellerUiState(
        id = this.id,
        name = this.name,
        email = this.email,
        phone = this.phone,
        image = this.image,
        logo = this.logo,
        description = this.description,
        distance = this.distance,
        type = this.type,
        status = this.status,
        lat = this.lat,
        lng = this.lng,
        address = this.address,
        appointments = this.appointments,
        trending = this.trending,
        popular = this.popular,
        rate = this.rate,
        isFavorite = this.isFavorite,
        categories = this.categories.map {
            PopularSellerUiState.Category(
                id = it.id,
                name = it.name,
                image = it.image,
                active = it.active
            )
        },
        token = this.token,
        information = PopularSellerUiState.Information(
            id = this.information.id,
            identityNumber = this.information.identityNumber,
            taxRecord = this.information.taxRecord,
            activity = this.information.activity,
            nationality = this.information.nationality,
            vehicleImage = this.information.vehicleImage,
            vehicleTabletImage = this.information.vehicleTabletImage,
            vehicleRegistration = this.information.vehicleRegistration,
            drivingImage = this.information.drivingImage
        ),
        productCategories = this.productCategories.map {
            it.toUiState()
        }
    )
}