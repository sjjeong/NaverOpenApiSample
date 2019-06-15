package com.googry.naveropenapisample

import android.app.Application
import com.dino.library.di.getDinoNetworkModule
import com.dino.library.ext.setupKoin
import com.googry.naver.domain.di.dinoNaverDomainModule
import com.googry.naver.remote.di.dinoNaverRemoteModule
import com.googry.naver.repository.di.dinoNaverRepositoryModule
import com.googry.naveropenapisample.di.appViewModelModule

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(
            this,
            getDinoNetworkModule("https://openapi.naver.com/"),
            dinoNaverDomainModule,
            dinoNaverRepositoryModule,
            dinoNaverRemoteModule,
            appViewModelModule
        )
    }

}