package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.categories.BaseCategoryDto
import com.abaferas.yajhz.data.models.categories.HomeBaseCategoryDto
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.data.models.categories.TrendingSellerDto
import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.domain.models.PopularSeller
import com.abaferas.yajhz.domain.models.TrendingSeller

fun TrendingSellerDto.toDomainModel(): TrendingSeller {
    return TrendingSeller(
        data = this.data.map {
            TrendingSeller.Data(
                id = it.id ?: 0,
                name = it.name ?: "",
                email = it.email ?: "",
                phone = it.phone ?: "",
                image = it.image ?: "",
                logo = it.logo ?: "",
                description = it.description ?: "",
                distance = it.distance ?: "",
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
                    TrendingSeller.Data.Category(
                        id = category?.id ?: 0,
                        name = category?.name ?: "",
                        image = category?.image ?: "",
                        active = category?.active ?: 0
                    )
                } ?: emptyList(),
                token = it.token ?: "",
                information = TrendingSeller.Data.Information(
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
                productCategories = it.productCategories?.map { pCat ->
                    TrendingSeller.Data.ProductCategory(
                        id = pCat?.id ?: 0,
                        name = pCat?.name ?: "",
                        active = pCat?.active ?: 0,
                        nameAr = pCat?.nameAr ?: "",
                        nameEn = pCat?.nameEn ?: ""
                    )
                } ?: emptyList()
            )
        }
    )
}