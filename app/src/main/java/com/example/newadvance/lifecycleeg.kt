package com.example.newadvance

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class lifecycleeg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lifecycleeg)
        lifecycle.addObserver(Oberver())
        Log.d("Main","Mainactivity-on create")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main","Mainactivity-on onRestart")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main","Mainactivity-on onDestroy")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Main","Mainactivity-on onStop")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Main","Mainactivity-on onPause")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Main","Mainactivity-on onResume")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Main","Mainactivity-on onStart")

    }
}