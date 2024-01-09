package com.abaferas.yajhz.data.mappers

import com.abaferas.yajhz.data.models.auth.ClientProfileDto
import com.abaferas.yajhz.domain.models.Client

fun ClientProfileDto.toDomainModel(): Client {
    return Client(
        id = this.id ?: 0,
        name = this.name ?: "",
        email = this.email ?: "",
        phone = this.phone ?: "",
        image = this.image ?: "",
        type = this.type ?: 0,
        status = this.status ?: 0,
        balance = this.balance ?: "",
        addresses = this.addresses?.map {
            it.toDomain()
        } ?: emptyList(),
        token = this.token ?: ""
    )
}