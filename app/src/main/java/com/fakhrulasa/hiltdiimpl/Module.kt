package com.fakhrulasa.hiltdiimpl

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
class Module {
    @Provides
    fun provideInterface():ProvideInterface{
        return ProvideInterfaceImp()
    }
}