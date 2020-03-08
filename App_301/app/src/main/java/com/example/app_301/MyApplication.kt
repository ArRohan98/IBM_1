package com.example.app_301

import android.app.Application
import android.content.res.Configuration
import android.util.Log


class MyApplication : Application() {

    val TAG = ".MyApplication"

    override fun onCreate() {
        super.onCreate()

        instance = this
        Log.d(TAG, "onCreate")
    }



    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")
    }

    companion object {
        // Returns the application instance
        var instance: MyApplication? = null

    }
}