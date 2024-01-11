package com.abaferas.yajhz.data.repository

import android.util.Log
import com.abaferas.yajhz.data.mappers.toDomainModel
import com.abaferas.yajhz.data.models.auth.BaseResponse
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.models.categories.PopularSellerDto
import com.abaferas.yajhz.data.service.ApiService
import com.abaferas.yajhz.data.service.TokenProvider
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.domain.models.BaseCategory
import com.abaferas.yajhz.domain.models.Client
import com.abaferas.yajhz.domain.models.HomeBaseCategory
import com.abaferas.yajhz.domain.models.PopularSeller
import com.abaferas.yajhz.domain.models.TrendingSeller
import retrofit2.Response
import java.net.UnknownHostException
import javax.inject.Inject

class IRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val tokenProvider: TokenProvider
): IRepository {
    override suspend fun userLogin(loginBody: LoginBody): Auth {
/*        return try {
            val request = apiService.userLogin(loginBody)
            if (request.isSuccessful && request.body() != null){
                if (request.body()!!.success){
                    val result = request.body()!!.data
                    val address = if (result.addresses.isNotEmpty()) {
                        result.addresses.first().address } else { "No Address provided!" }
                    tokenizeUserData(name = result.name ?: "", token = result.token ?: "",address = address ?: " ")
                    result.toDomainModel()
                }
               else{
                   throw YajhzException.NotAuthorized
               }
            }else{
                throw YajhzException.Failure
            }
        }catch (e: Exception){
            println(e.message.toString())
            throw e
        }*/
        TODO("Not yet implemented")

    }

    override suspend fun userSignUp(signUpBody: SignUpBody): Auth {
        /*val result = wrapBaseResponse { apiService.userSignUp(signUpBody) }.toDomainModel()
        val address = if (result.addresses.isNotEmpty()) {
            result.addresses.first().address
        }else{
            "No Address provided!"
        }
        tokenizeUserData(name = result.name, token = result.token,address = address)
        return result*/
        TODO("Not yet implemented")
    }

    override suspend fun getClientProfile(): Client {
        //return wrapBaseResponse { apiService.getClientProfile() }.toDomainModel()
        TODO("Not yet implemented")
    }

    override suspend fun getHomePopularSeller(): PopularSellerDto {
        return try {
            val body = apiService.getHomePopularSeller().body()
            if (body != null){
                Log.e(
                    "X-TEST",
                    "msg: ${body.message}, success: ${body.success}")
                Log.w("X-TEST",body.data.toString())

                // Additional logging
                body.data.data?.let { dataList ->
                    Log.d("X-TEST", "Item in dataList: $dataList")
                }
                body.data
            }else {
                Log.e("X-TEST","Body is Null")
                throw NullPointerException()
            }
        }catch (e: Exception){
            Log.e("X-TEST",e.message.toString())
            throw e
        }
    }

    override suspend fun getHomeTrendingSeller(): TrendingSeller {
        //return wrapBaseResponse { apiService.getHomeTrendingSeller() }.toDomainModel()
        TODO("Not yet implemented")
    }

    override suspend fun getHomeBaseCategory(): HomeBaseCategory {
        //return wrapBaseResponse { apiService.getHomeBaseCategory() }.toDomainModel()
        TODO("Not yet implemented")
    }

    override suspend fun getBaseCategory(): BaseCategory {
       // return wrapBaseResponse { apiService.getBaseCategory() }.toDomainModel()
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
            println("Error in wrapBaseResponse: ${e.message}")
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