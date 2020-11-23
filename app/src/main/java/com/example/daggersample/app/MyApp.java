package com.example.daggersample.app;

import android.app.Application;

import com.example.daggersample.di.ApplicationComponent;

public class MyApp extends Application {

    private ApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // Dagger%COMPONENT_NAME%
        //mAppComponent = DaggerApplicationGraph.create();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //mAppComponent = DaggerApplicationGraph.create();
    }

    public ApplicationComponent getAppComponent() {
        return mAppComponent;
    }
}