package com.dougritter.baseproject.presentation.internal.di.components

import android.content.Context

import com.dougritter.baseproject.domain.executor.PostExecutionThread
import com.dougritter.baseproject.domain.executor.ThreadExecutor
import com.dougritter.baseproject.presentation.internal.di.modules.ApplicationModule
import com.dougritter.baseproject.presentation.view.activity.BaseActivity

import dagger.Component
import javax.inject.Singleton

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(baseActivity: BaseActivity)

    //Exposed to sub-graphs.
    fun context(): Context

    fun threadExecutor(): ThreadExecutor
    fun postExecutionThread(): PostExecutionThread
    //  UserRepository userRepository();
}
