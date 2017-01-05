package com.dougritter.baseproject.presentation

import android.app.Application

import com.dougritter.baseproject.BuildConfig
import com.dougritter.baseproject.presentation.internal.di.components.ApplicationComponent
import com.dougritter.baseproject.presentation.internal.di.components.DaggerApplicationComponent
import com.dougritter.baseproject.presentation.internal.di.modules.ApplicationModule

class AndroidApplication : Application() {

    var applicationComponent: ApplicationComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        this.initializeInjector()
        this.initializeLeakDetection()
    }

    private fun initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) {
        }
    }

}
