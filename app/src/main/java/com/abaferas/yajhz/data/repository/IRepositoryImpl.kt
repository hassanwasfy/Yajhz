package com.abaferas.yajhz.data.repository

import com.abaferas.yajhz.data.mappers.toDomainModel
import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.service.ApiService
import com.abaferas.yajhz.data.service.TokenProvider
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.domain.models.Client
import com.abaferas.yajhz.domain.models.PopularSeller
import retrofit2.Response
import java.net.UnknownHostException
import javax.inject.Inject

class IRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val tokenProvider: TokenProvider
): IRepository {
    override suspend fun userLogin(loginBody: LoginBody): Auth {
        val result = wrapBaseResponse { apiService.userLogin(loginBody) }.toDomainModel()
        val address = if (result.addresses.isNotEmpty()) {
            result.addresses.first().address
        }else{
            "No Address provided!"
        }
        tokenizeUserData(name = result.name, token = result.token,address = address)
        return result
    }

    override suspend fun userSignUp(signUpBody: SignUpBody): Auth {
        val result = wrapBaseResponse { apiService.userSignUp(signUpBody) }.toDomainModel()
        val address = if (result.addresses.isNotEmpty()) {
            result.addresses.first().address
        }else{
            "No Address provided!"
        }
        tokenizeUserData(name = result.name, token = result.token,address = address)
        return result
    }

    override suspend fun getClientProfile(): Client {
        return wrapBaseResponse { apiService.getClientProfile() }.toDomainModel()
    }

    override suspend fun getHomePopularSeller(): PopularSeller {
        TODO("Not yet implemented")
    }

    override suspend fun getHomeTrendingSeller(): PopularSeller {
        TODO("Not yet implemented")
    }

    override suspend fun getHomeBaseCategory(): PopularSeller {
        TODO("Not yet implemented")
    }

    override suspend fun getBaseCategory(): PopularSeller {
        TODO("Not yet implemented")
    }

    override suspend fun addItemToCart(): PopularSeller {
        TODO("Not yet implemented")
    }

    override suspend fun addItemToFavorites(): PopularSeller {
        TODO("Not yet implemented")
    }

    private suspend fun <T> wrapBaseResponse(
        response: suspend () -> Response<BaseResponse<T>>
    ): T {
        try {
            val data = response().body()

            if (data != null) {
                if (response().isSuccessful) {
                    if (data.success) {
                        return data.data
                    } else {
                        throw YajhzException.NotAuthorized
                    }
                } else {
                    throw YajhzException.Failure
                }
            } else {
                throw YajhzException.NullData
            }
        } catch (e: YajhzException) {
            throw e
        } catch (e: Exception) {
            throw YajhzException.UnknownError
        } catch (e: UnknownHostException){
            throw YajhzException.UnknownHostException
        }
    }

    private fun tokenizeUserData(name: String, token: String, address: String){
        tokenProvider.setToken(token)
        tokenProvider.setName(name)
        tokenProvider.setAddress(address)
    }

}