package com.bilalqwatly.test.di

import com.bilalqwatly.test.data.network.KtorClient
import com.bilalqwatly.test.data.repositories.ApiRepositoryImpl
import com.bilalqwatly.test.domin.repositories.api.ApiRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.*


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {


    @Provides
    fun provideHttpClient(ktorClient: KtorClient): HttpClient = ktorClient.getHttpClient()

    @Provides
    fun provideApiRepository(httpClient: HttpClient): ApiRepository =
        ApiRepositoryImpl(httpClient = httpClient)

}