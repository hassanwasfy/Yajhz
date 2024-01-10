package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.domain.models.PopularSeller

fun PopularSellerDto.toDomainModel(): PopularSeller {
    return PopularSeller(
        id = this.id ?: 0,
        name = this.name ?: "",
        email = this.email ?: "",
        phone = this.phone ?: "",
        image = this.image ?: "",
        logo = this.logo ?: "",
        description = this.description ?: "",
        distance = this.distance ?: "",
        type = this.type ?: 0,
        status = this.status ?: 0,
        lat = this.lat ?: "",
        lng = this.lng ?: "",
        address = this.address ?: "",
        appointments = this.appointments ?: "",
        trending = this.trending ?: 0,
        popular = this.popular ?: 0,
        rate = this.rate ?: "",
        isFavorite = this.isFavorite ?: false,
        categories = this.categories.map {
            PopularSeller.Category(
                id = it.id ?: 0,
                name = it.name ?: "",
                image = it.image ?: "",
                active = it.active ?: 0
            )
        },
        token = this.token ?: "",
        information = PopularSeller.Information(
            id = this.information.id ?: 0,
            identityNumber = this.information.identityNumber ?: "",
            taxRecord = this.information.taxRecord ?: "",
            activity = this.information.activity ?: "",
            nationality = this.information.nationality ?: "",
            vehicleImage = this.information.vehicleImage ?: "",
            vehicleTabletImage = this.information.vehicleTabletImage ?: "",
            vehicleRegistration = this.information.vehicleRegistration ?: "",
            drivingImage = this.information.drivingImage ?: ""
        ),
        productCategories = this.productCategories.map {
            it.toDomainModel()
        }
    )
}

fun List<PopularSellerDto>.toDomain(): List<PopularSeller>{
    return this.map { it.toDomainModel() }
}