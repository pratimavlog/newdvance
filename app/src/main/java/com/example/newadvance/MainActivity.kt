package com.example.newadvance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.newadvance.databinding.ActivityMainBinding
//import com.example.newadvance.view.mvvm

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewmodle.setOnClickListener{
            var i=Intent(this,viewmodel::class.java)
            startActivity(i)
        }
        

        binding.navogation.setOnClickListener {
            var i=Intent(this,navigation::class.java)
            startActivity(i)
        }


        binding.corotines.setOnClickListener {
            var i=Intent(this,corotine::class.java)
            startActivity(i)
        }
        binding.suspend.setOnClickListener {
            var i=Intent(this,suspendfunction::class.java)
            startActivity(i)
        }


        
    }
}