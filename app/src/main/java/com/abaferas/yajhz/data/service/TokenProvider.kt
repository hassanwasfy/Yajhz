package com.abaferas.yajhz.data.service

class TokenProvider(initialToken: String) {
    private var token: String = initialToken
    fun setToken(newToken: String) {
        token = newToken
    }

    fun getToken(): String {
        return token
    }
}