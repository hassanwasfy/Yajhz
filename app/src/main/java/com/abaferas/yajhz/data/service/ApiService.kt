package com.abaferas.yajhz.data.service

import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.data.models.categories.BaseCategoryDto
import com.abaferas.yajhz.data.models.categories.HomeBaseCategoryDto
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.data.models.categories.TrendingSellerDto
import com.abaferas.yajhz.domain.models.HomeBaseCategory
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {


    //region Auth
    @POST("login")
    suspend fun userLogin(@Body loginBody: LoginBody): Response<BaseResponse<AuthDto>>

    @POST("client-register")
    suspend fun userSignUp(@Body signUpBody: SignUpBody): Response<BaseResponse<AuthDto>>

    @GET("client-profile")
    suspend fun getClientProfile(): Response<BaseResponse<ClientProfileDto>>
    //endregion


    //region Home
    @GET("popular-sellers")
    suspend fun getHomePopularSeller(): Response<BaseResponse<PopularSellerDto>>

    @GET("trending-sellers")
    suspend fun getHomeTrendingSeller(): Response<BaseResponse<TrendingSellerDto>>

    @GET("home-base-categories")
    suspend fun getHomeBaseCategory(): Response<BaseResponse<HomeBaseCategoryDto>>

    @GET("base-categories")
    suspend fun getBaseCategory(): Response<BaseResponse<BaseCategoryDto>>
    //endregion

    //region Cart
    @POST("add-to-cart")
    suspend fun addItemToCart(): Response<BaseResponse<PopularSellerDto>>
    //endregion

    //region Favorites
    @POST("favorite")
    suspend fun addItemToFavorites(): Response<BaseResponse<PopularSellerDto>>
    //endregion




}