package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.service.ApiService
import com.abaferas.yajhz.data.service.TokenProvider
import javax.inject.Inject

class IRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val tokenProvider: TokenProvider
): IRepository {
    override suspend fun userLogin(loginBody: LoginBody): AuthDto {
        TODO("Not yet implemented")
    }

    override suspend fun userSignUp(signUpBody: SignUpBody): AuthDto {
        TODO("Not yet implemented")
    }

    override suspend fun getClientProfile(): ClientProfileDto {
        TODO("Not yet implemented")
    }
}