package com.example.newadvance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.newadvance.databinding.ActivityAdvanceBinding

class advance : AppCompatActivity() {
    private lateinit var binding:ActivityAdvanceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityAdvanceBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.lifecycle.setOnClickListener {
            var i=Intent(this,lifecycleeg::class.java)
            startActivity(i)
        }

    }
}