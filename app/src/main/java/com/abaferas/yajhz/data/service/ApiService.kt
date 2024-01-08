package com.abaferas.yajhz.data.service

import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
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

    //endregion

    //region Cart

    //endregion

    //region Favorites

    //endregion




}