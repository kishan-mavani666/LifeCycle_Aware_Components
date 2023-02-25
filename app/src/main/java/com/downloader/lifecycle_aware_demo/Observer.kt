package com.downloader.lifecycle_aware_demo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){

        Log.d("Main","observe-on create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onpause(){

        Log.d("Main","observe-on pause")

    }
}