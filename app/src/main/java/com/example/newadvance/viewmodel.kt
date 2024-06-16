package com.example.newadvance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.newadvance.databinding.ActivityViewmodelBinding

class viewmodel : AppCompatActivity() {
private lateinit var binding:ActivityViewmodelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityViewmodelBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // var number=0
        var viewModel:viewmodelclass=ViewModelProvider(this).get(viewmodelclass::class.java)
        binding.tv.text=viewModel.number.toString()

        binding.btn.setOnClickListener {
         //   number++

            binding.tv.text=viewModel.addOne().toString()


        }

    }
}