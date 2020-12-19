package com.devdanielleguizamon.piloto01.presentation.di

import com.devdanielleguizamon.piloto01.data.api.ApiService
import com.devdanielleguizamon.piloto01.presentation.network.ManagerNetwork
import org.koin.dsl.module

val networkModule = module {
    single { ManagerNetwork().createWebService().create(ApiService::class.java) }
}

