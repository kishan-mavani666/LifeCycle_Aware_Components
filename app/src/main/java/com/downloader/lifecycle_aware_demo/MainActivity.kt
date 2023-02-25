package com.downloader.lifecycle_aware_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())

        Log.d("Main","Activity-on create")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main","Activity_on pause")
    }
}