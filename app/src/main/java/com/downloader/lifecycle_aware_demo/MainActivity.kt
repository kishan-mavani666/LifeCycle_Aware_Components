package com.downloader.lifecycle_aware_demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.downloader.lifecycle_aware_demo.observer.MainActivityObserver

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MainActivityObserver())
        Log.e("ABCDFERGTYHJ", "MainActivity onCreate")
    }

    override fun onPause() {
        super.onPause()
        Log.e("ABCDFERGTYHJ", "MainActivity onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.e("ABCDFERGTYHJ", "MainActivity onResume")
    }
}