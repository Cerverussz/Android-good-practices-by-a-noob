package com.devdanielleguizamon.piloto01.domain.repository

import io.reactivex.Single

interface FilmsRepository {

    fun getFilmsService(): Single<List<String>>

}
