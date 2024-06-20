package com.example.newadvance

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Oberver:LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate()
    {
        Log.d("Main","Oberver- ON-Create")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart()
    {
        Log.d("Main","Oberver- ON-onStart")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun OnResume()
    {
        Log.d("Main","Oberver- OnResume")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onpause()
    {
        Log.d("Main","Oberver- ON-pause")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onstop()
    {
        Log.d("Main","Oberver- ON-stop")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ondestoy()
    {
        Log.d("Main","Oberver- ON-Desteoy")
    }
}