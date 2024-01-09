package com.abaferas.yajhz.ui.mappers

import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.domain.models.Client
import com.abaferas.yajhz.ui.models.ClientUiState

fun Client.toUiState(): ClientUiState {
    return ClientUiState(
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
        token = this.token
    )
}