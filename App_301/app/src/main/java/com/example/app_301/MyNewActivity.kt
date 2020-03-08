package com.example.app_301;
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

public class MyNewActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Initialize Activity and inflate the UI.
        Log.d("MyNewActivity", "onCreate()")
    }
}
