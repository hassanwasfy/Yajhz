package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.auth.AddresseDto
import com.abaferas.yajhz.data.models.auth.AuthDto
import com.abaferas.yajhz.domain.models.Address
import com.abaferas.yajhz.domain.models.Auth

fun AuthDto.toDomainModel(): Auth {
    return Auth(
        id = this.id ?: 0,
        name = this.name ?: "",
        email = this.email ?: "",
        phone = this.phone ?: "",
        image = this.image ?: "",
        type = this.type ?: 0,
        status = this.status ?: 0,
        balance = this.balance ?: 0,
        addresses = this.addresses.map {
            it.toDomain()
        },
        token = this.token ?: "",
    )
}

fun AddresseDto.toDomain(): Address {
    return Address(
        id = this.id ?: 0,
        lat = this.lat ?: "",
        lng = this.lng ?: "",
        address = this.address ?: "",
        street = this.street ?: "",
        building = this.building ?: "",
        apartment = this.apartment ?: "",
        floor = this.floor ?: 0,
        name = this.name ?: ""
    )
}