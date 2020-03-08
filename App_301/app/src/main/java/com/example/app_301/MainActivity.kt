package com.example.app_301

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var TAG = ".MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Activity", "onCreate")
        setContentView(R.layout.activity_main)
    }
    override fun onPause() {
        super.onPause()
        Log.d("MyActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyActivity", "onDestroy")
    }


    override fun onCreateOptionsMenu(menu : Menu):Boolean
    {
         super.onCreateOptionsMenu(menu)
        val Inflater = menuInflater
        Inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "Activity onConfigurationChanged")
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.d(TAG, "Orientation potrait")
        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.d(TAG, "Orientation Landscape")
        }
        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            Log.d(TAG, "Keyboard Hidden No")
        }
    }

}
