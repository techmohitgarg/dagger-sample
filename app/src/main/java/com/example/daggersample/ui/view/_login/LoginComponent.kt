package com.example.daggersample.ui.view._login

import com.example.daggersample.di.scopes.ActivityScope
import com.example.daggersample.ui.view._login.ui.login.LoginActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface LoginComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }
    fun inject(activity: LoginActivity)
}
