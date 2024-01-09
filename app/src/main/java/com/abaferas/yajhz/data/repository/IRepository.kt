package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface IRepository {
    suspend fun userLogin(loginBody: LoginBody): AuthDto
    suspend fun userSignUp(signUpBody: SignUpBody): AuthDto
    suspend fun getClientProfile(): ClientProfileDto

    //region Home
    suspend fun getHomePopularSeller(): PopularSellerDto
    suspend fun getHomeTrendingSeller(): PopularSellerDto
    suspend fun getHomeBaseCategory(): PopularSellerDto
    suspend fun getBaseCategory(): PopularSellerDto
    //endregion

    //region Cart
    suspend fun addItemToCart(): PopularSellerDto
    //endregion

    //region Favorites
    suspend fun addItemToFavorites(): PopularSellerDto
    //endregion
}