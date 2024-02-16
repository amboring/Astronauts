package com.al.astronauts.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SpaceServiceFactory {
    private const val BASE_URL = "http://api.open-notify.org/"
    fun makeService(): SpaceService {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(HTTPLogger.getLogger())
            .build()
        return retrofit.create(SpaceService::class.java)

    }
}

object HTTPLogger {
    fun getLogger(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }
}

