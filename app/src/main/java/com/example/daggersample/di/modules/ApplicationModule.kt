package com.example.daggersample.di.modules

import android.app.Application
import com.example.daggersample.util.PreferenceHelper
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

// Tells Dagger this is a Dagger module
@Module
class ApplicationModule constructor(private val application: Application) {


    @Provides
    @Singleton
    public fun getApplication(): Application {
        return application
    }

    /*@Provides
    @Singleton
    public fun getPreferenceHelper(application: Application): PreferenceHelper {
        return PreferenceHelper(application)
    }*/


}