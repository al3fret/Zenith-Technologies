package com.bilalqwatly.test.domin.repositories.api


import com.bilalqwatly.test.data.network.Response
import com.bilalqwatly.test.domin.entites.Product
import kotlinx.coroutines.flow.Flow

interface ApiRepository {


    suspend fun getWorkOrders(): Flow<Response<List<Product>>>

}