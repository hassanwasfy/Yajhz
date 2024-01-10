package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.domain.models.PopularSeller
import com.abaferas.yajhz.domain.models.TrendingSeller
import com.abaferas.yajhz.ui.models.HomeBaseCategoryUiState
import com.abaferas.yajhz.ui.models.PopularSellerUiState
import com.abaferas.yajhz.ui.models.TrendingSellerUiState

fun TrendingSeller.toUiStateModel(): TrendingSellerUiState {
    return TrendingSellerUiState(
        data = this.data.map {
            TrendingSellerUiState.Data(
                id = it.id,
                name = it.name,
                email = it.email,
                phone = it.phone,
                image = it.image,
                logo = it.logo,
                description = it.description,
                distance = it.distance,
                type = it.type,
                status = it.status,
                lat = it.lat,
                lng = it.lng,
                address = it.address,
                appointments = it.appointments,
                trending = it.trending,
                popular = it.popular,
                rate = it.rate,
                isFavorite = it.isFavorite,
                categories = it.categories.map { pCat ->
                    TrendingSellerUiState.Data.Category(
                        id = pCat.id,
                        name = pCat.name,
                        image = pCat.image,
                        active = pCat.active
                    )
                },
                token = it.token,
                information = TrendingSellerUiState.Data.Information(
                    id = it.information.id,
                    identityNumber = it.information.identityNumber,
                    taxRecord = it.information.taxRecord,
                    activity = it.information.activity,
                    nationality = it.information.nationality,
                    vehicleImage = it.information.vehicleImage,
                    vehicleTabletImage = it.information.vehicleTabletImage,
                    vehicleRegistration = it.information.vehicleRegistration,
                    drivingImage = it.information.drivingImage
                ),
                productCategories = it.productCategories.map { items ->
                    TrendingSellerUiState.Data.ProductCategory(
                        id = items.id,
                        name = items.name,
                        active = items.active,
                        nameAr = items.nameAr,
                        nameEn = items.nameEn
                    )
                }
            )
        }
    )
}