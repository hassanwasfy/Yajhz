package com.abaferas.yajhz.data.service

class TokenProvider(initialToken: String) {
    private var token: String = initialToken
    private var name: String = ""
    private var address: String = ""
    fun setToken(newToken: String) {
        token = newToken
    }

    fun getToken(): String {
        return token
    }

    fun setName(newName: String) {
        name = newName
    }

    fun getName(): String {
        return name
    }

    fun setAddress(newAddress: String) {
        address = newAddress
    }

    fun getAddress(): String {
        return address
    }


}