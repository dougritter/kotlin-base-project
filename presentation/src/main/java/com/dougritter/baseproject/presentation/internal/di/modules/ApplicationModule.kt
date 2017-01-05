/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dougritter.baseproject.presentation.internal.di.modules

import android.content.Context

import com.dougritter.baseproject.data.executor.JobExecutor
import com.dougritter.baseproject.domain.executor.PostExecutionThread
import com.dougritter.baseproject.domain.executor.ThreadExecutor
import com.dougritter.baseproject.presentation.AndroidApplication
import com.dougritter.baseproject.presentation.UIThread

import javax.inject.Singleton

import dagger.Module
import dagger.Provides

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
class ApplicationModule(private val application: AndroidApplication) {

    @Provides
    @Singleton
    internal fun provideApplicationContext(): Context = this.application

    @Provides
    @Singleton
    internal fun provideThreadExecutor(jobExecutor: JobExecutor): ThreadExecutor = jobExecutor

    @Provides
    @Singleton
    internal fun providePostExecutionThread(uiThread: UIThread): PostExecutionThread = uiThread

    /*@Provides @Singleton UserCache provideUserCache(UserCacheImpl userCache) {
    return userCache;
  }

  @Provides @Singleton UserRepository provideUserRepository(UserDataRepository userDataRepository) {
    return userDataRepository;
  }*/
}
