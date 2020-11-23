package com.example.daggersample.util

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class PreferenceHelper @Inject constructor(application: Application) {

    private val PREFNAME = "dagger_pref"
    private val sharedPreferences: SharedPreferences

    init {
        sharedPreferences = application.getSharedPreferences(PREFNAME, Context.MODE_PRIVATE)
    }

    fun getPreference(): SharedPreferences = sharedPreferences

    inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        operation(editMe)
        editMe.apply()
    }

    inline fun SharedPreferences.Editor.put(pair: Pair<String, Any>) {
        val key = pair.first
        val value = pair.second
        when (value) {
            is String -> putString(key, value)
            is Int -> putInt(key, value)
            is Boolean -> putBoolean(key, value)
            is Long -> putLong(key, value)
            is Float -> putFloat(key, value)
            else -> error("Only primitive types can be stored in SharedPreferences")
        }
    }


}