package com.devdanielleguizamon.piloto01

import android.app.Application
import com.devdanielleguizamon.piloto01.presentation.di.networkModule
import com.devdanielleguizamon.piloto01.presentation.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(applicationContext)
            modules(listOf(networkModule,repositoryModule))
        }
    }
}