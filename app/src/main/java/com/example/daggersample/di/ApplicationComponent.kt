package com.example.daggersample.di

import android.content.Context
import com.example.daggersample.di.modules.AppSubcomponents
import com.example.daggersample.di.modules.ApplicationModule
import com.example.daggersample.ui.view._login.LoginComponent
import com.example.daggersample.ui.view._login.ui.login.LoginActivity
import com.example.daggersample.util.PreferenceHelper
import dagger.BindsInstance
import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, AppSubcomponents::class])
interface ApplicationComponent {

    fun getLoginComponents() : LoginComponent.Factory

}