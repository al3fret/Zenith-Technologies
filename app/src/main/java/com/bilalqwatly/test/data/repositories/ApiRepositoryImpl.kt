package com.bilalqwatly.test.data.repositories


import com.bilalqwatly.test.data.network.ErrorHandler
import com.bilalqwatly.test.data.network.NetworkConstant
import com.bilalqwatly.test.data.network.Response
import com.bilalqwatly.test.domin.entites.Product
import com.bilalqwatly.test.domin.repositories.api.ApiRepository
import io.ktor.client.*
import io.ktor.client.request.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiRepositoryImpl @Inject constructor(
    private val httpClient: HttpClient,


    ) : ApiRepository {


    override suspend fun getWorkOrders(): Flow<Response<List<Product>>> =
        flow {

            emit(Response.Loading)

            try {

                emit(
                    Response.Success(
                        httpClient.get(NetworkConstant.PRODUCT_URL) {

                        }
                    )
                )

            } catch (e: Exception) {
                e.printStackTrace()

                emit(Response.Error(ErrorHandler.getErrorMessage(exception = e)))


            }
        }


}