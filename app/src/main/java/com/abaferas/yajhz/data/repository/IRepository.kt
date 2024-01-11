package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.domain.models.Client
import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.domain.models.PopularSeller
import com.abaferas.yajhz.domain.models.TrendingSeller

interface IRepository {
    suspend fun userLogin(loginBody: LoginBody): Auth
    suspend fun userSignUp(signUpBody: SignUpBody): Auth
    suspend fun getClientProfile(): Client

    //region Home
    suspend fun getHomePopularSeller(): PopularSellerDto
    suspend fun getHomeTrendingSeller(): TrendingSeller
    suspend fun getHomeBaseCategory(): HomeBaseCategory
    suspend fun getBaseCategory(): BaseCategory
    //endregion

    //region Cart
    suspend fun addItemToCart(): PopularSeller
    //endregion

    //region Favorites
    suspend fun addItemToFavorites(): PopularSeller
    //endregion
}