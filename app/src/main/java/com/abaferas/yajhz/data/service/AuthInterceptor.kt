package com.abaferas.yajhz.data.service

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private val tokenProvider: TokenProvider) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val newRequest = originalRequest.newBuilder()
            .header("Authorization", "Bearer ${tokenProvider.getToken()}")
            .header("Accept","application/json")
            .header("lang","ar")
            .build()
        return chain.proceed(newRequest)
    }
}

class TokenProvider(initialToken: String) {
    private var token: String = initialToken
    fun setToken(newToken: String) {
        token = newToken
    }

    fun getToken(): String {
        return token
    }
}