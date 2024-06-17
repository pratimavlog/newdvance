package com.example.newadvance

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.newadvance.databinding.ActivityCorotineBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class corotine : AppCompatActivity() {
    private lateinit var binding:ActivityCorotineBinding
    private var TAG="kotlinfun"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityCorotineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCorotine.setOnClickListener {
            Log.d(TAG,"${Thread.currentThread().name}")
          binding.tvCorotine.text= "${binding.tvCorotine.text.toString().toInt()+ 1}"
        }



    }

    fun slow()
    {
        for (i in 1.. 1000000000L){

        }

    }

    fun onaction(view: View) {
        CoroutineScope(Dispatchers.IO).launch{
            Log.d(TAG,"${Thread.currentThread().name}")

        }
        GlobalScope.launch(Dispatchers.Main){
            Log.d(TAG,"${Thread.currentThread().name}")

        }
        MainScope().launch(Dispatchers.Default){
            Log.d(TAG,"${Thread.currentThread().name}")

        }
    }

}