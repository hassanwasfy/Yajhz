package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.domain.models.Client
import com.abaferas.yajhz.domain.models.PopularSeller
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface IRepository {
    suspend fun userLogin(loginBody: LoginBody): Auth
    suspend fun userSignUp(signUpBody: SignUpBody): Auth
    suspend fun getClientProfile(): Client

    //region Home
    suspend fun getHomePopularSeller(): PopularSeller
    suspend fun getHomeTrendingSeller(): PopularSeller
    suspend fun getHomeBaseCategory(): PopularSeller
    suspend fun getBaseCategory(): PopularSeller
    //endregion

    //region Cart
    suspend fun addItemToCart(): PopularSeller
    //endregion

    //region Favorites
    suspend fun addItemToFavorites(): PopularSeller
    //endregion
}