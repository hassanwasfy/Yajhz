package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.domain.models.Address
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.ui.models.AddressUiState
import com.abaferas.yajhz.ui.models.AuthUiState

fun Auth.toUiState(): AuthUiState {
    return AuthUiState(
        id = this.id,
        name = this.name,
        email = this.email,
        phone = this.phone,
        image = this.image,
        type = this.type,
        status = this.status,
        balance = this.balance,
        addresses = this.addresses.map {
            it.toUiState()
        },
        token = this.token,
    )
}

fun Address.toUiState(): AddressUiState {
    return AddressUiState(
        id = this.id,
        lat = this.lat,
        lng = this.lng,
        address = this.address,
        street = this.street,
        building = this.building,
        apartment = this.apartment,
        floor = this.floor,
        name = this.name
    )
}