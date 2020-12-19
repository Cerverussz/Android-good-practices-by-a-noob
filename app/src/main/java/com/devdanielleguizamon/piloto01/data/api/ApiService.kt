package com.devdanielleguizamon.piloto01.data.api

import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("url/v1/movies")
    fun getFilmsService(): Single<List<String>>
}
