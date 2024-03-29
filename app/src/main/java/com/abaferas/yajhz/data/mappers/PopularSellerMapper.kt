package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.BaseCategoryDto
import com.abaferas.yajhz.data.models.categories.HomeBaseCategoryDto
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.domain.models.PopularSeller

fun PopularSellerDto.toDomainModel(): PopularSeller {
    return PopularSeller(
        data = this.data?.data?.map {
            PopularSeller.Data(
                id = it.id ?: 0,
                name = it.name ?: "",
                email = it.email ?: "",
                phone = it.phone ?: "",
                image = it.image ?: "",
                logo = it.logo ?: "",
                description = it.description ?: "",
                distance = it.distance ?: 0,
                type = it.type ?: 0,
                status = it.status ?: 0,
                lat = it.lat ?: "",
                lng = it.lng ?: "",
                address = it.address ?: "",
                appointments = it.appointments ?: "",
                trending = it.trending ?: 0,
                popular = it.popular ?: 0,
                rate = it.rate ?: "",
                isFavorite = it.isFavorite ?: false,
                categories = it.categories?.map { category ->
                    PopularSeller.Data.Category(
                        id = category.id ?: 0,
                        name = category.name ?: "",
                        image = category.image ?: "",
                        active = category.active ?: 0
                    )
                } ?: emptyList(),
                token = it.token ?: "",
                information = PopularSeller.Data.Information(
                    id = it.information?.id ?: 0,
                    identityNumber = it.information?.identityNumber ?: "",
                    taxRecord = it.information?.taxRecord ?: "",
                    activity = it.information?.activity ?: 0,
                    nationality = it.information?.nationality ?: "",
                    vehicleImage = it.information?.vehicleImage ?: "",
                    vehicleTabletImage = it.information?.vehicleTabletImage ?: "",
                    vehicleRegistration = it.information?.vehicleRegistration ?: "",
                    drivingImage = it.information?.drivingImage ?: ""
                ),
                productCategories = it.productCategories?.map { pCategory ->
                    PopularSeller.Data.ProductCategory(
                        id = pCategory.id ?: 0,
                        name = pCategory.name ?: "",
                        active = pCategory.active ?: 0,
                        nameAr = pCategory.nameAr ?: "",
                        nameEn = pCategory.nameEn ?: ""
                    )
                } ?: emptyList()
            )
        } ?: emptyList()
    )
}