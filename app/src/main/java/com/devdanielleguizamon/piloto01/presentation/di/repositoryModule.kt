package com.devdanielleguizamon.piloto01.presentation.di

import com.devdanielleguizamon.piloto01.data.repository.FilmsRepositoryImpl
import com.devdanielleguizamon.piloto01.domain.repository.FilmsRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory<FilmsRepository>{ FilmsRepositoryImpl(apiService = get()) }
}
