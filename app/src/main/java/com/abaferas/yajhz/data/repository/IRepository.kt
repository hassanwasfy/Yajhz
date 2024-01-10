package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.domain.models.Client

interface IRepository {
    suspend fun userLogin(loginBody: LoginBody): Auth
    suspend fun userSignUp(signUpBody: SignUpBody): Auth
    suspend fun getClientProfile(): Client

    //region Home
    suspend fun getHomePopularSeller(): List<PopularSeller>
    suspend fun getHomeTrendingSeller(): List<PopularSeller>
    suspend fun getHomeBaseCategory(): HomeCategory
    suspend fun getBaseCategory(): List<ProductCategory>
    //endregion

    //region Cart
    suspend fun addItemToCart(): PopularSeller
    //endregion

    //region Favorites
    suspend fun addItemToFavorites(): PopularSeller
    //endregion
}