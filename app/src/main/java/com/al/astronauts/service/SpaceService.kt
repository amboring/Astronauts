package com.al.astronauts.service

import com.al.astronauts.model.AstronautsResponse
import com.al.astronauts.model.ISSPositionResponse
import retrofit2.Response
import retrofit2.http.GET

interface SpaceService {
    @GET("iss-now.json")
    suspend fun getISSLocation(): ISSPositionResponse?

    @GET("astros.json")
    suspend fun getAstronauts(): AstronautsResponse?
}