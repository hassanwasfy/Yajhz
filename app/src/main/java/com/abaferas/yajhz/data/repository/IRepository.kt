package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody

interface IRepository {
    suspend fun userLogin(loginBody: LoginBody): AuthDto
    suspend fun userSignUp(signUpBody: SignUpBody): AuthDto
    suspend fun getClientProfile(): ClientProfileDto
}