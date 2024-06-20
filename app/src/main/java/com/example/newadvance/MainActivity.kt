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

        binding.retrofit.setOnClickListener {
            var i=Intent(this,retrofiteg::class.java)
            startActivity(i)
        }

        binding.testinf.setOnClickListener {
            var i=Intent(this,testing::class.java)
            startActivity(i)
        }

        binding.livedata.setOnClickListener {
            var i=Intent(this,livedata::class.java)
            startActivity(i)
        }

        binding.cheecycode.setOnClickListener {
            var i=Intent(this,advance::class.java)
            startActivity(i)
        }





    }
}