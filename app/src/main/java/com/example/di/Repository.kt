package com.example.di

import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Singleton

class Repository(private val apiClient: ApiClient) {
    suspend fun getCurrencyByName(name: String): Response<BitcoinResponse> {
        val apiInterface = apiClient.client.create(ApiInterface::class.java)
        return apiInterface.getCryptoByName(name)
    }
}
