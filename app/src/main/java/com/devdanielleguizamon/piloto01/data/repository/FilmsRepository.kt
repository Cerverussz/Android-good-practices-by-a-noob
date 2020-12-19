package com.devdanielleguizamon.piloto01.data.repository

import com.devdanielleguizamon.piloto01.data.api.ApiService
import com.devdanielleguizamon.piloto01.domain.repository.FilmsRepository
import io.reactivex.Single

class FilmsRepositoryImpl(private val apiService: ApiService) : FilmsRepository {

    override fun getFilmsService(): Single<List<String>>  = Single.just(listOf())
}
