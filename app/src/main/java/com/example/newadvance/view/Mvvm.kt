package com.example.newadvance.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import calculateviewmodel
import com.example.newadvance.R
import com.example.newadvance.databinding.ActivityMvvmBinding

class mvvm : AppCompatActivity() {
    private lateinit var binding: ActivityMvvmBinding
    private lateinit var calculatorViewmodle:calculateviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMvvmBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewmodle=ViewModelProvider(this).get(calculateviewmodel::class.java)
        binding.calculate.setOnClickListener {
            val num1=binding.editTextNum1.text.toString().toIntOrNull()?: 0
            val num2=binding.editTextNum2.text.toString().toIntOrNull()?: 0

            val result=calculatorViewmodle.calculatesum(num1,num2)
            binding.resultTextview.text="${result.sum}"

        }

    }
}