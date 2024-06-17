package com.example.newadvance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.findNavController

class navigation : AppCompatActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_navigation)
    }

    override fun onSupportNavigateUp(): Boolean {
        navController=findNavController(R.id.navHostfragmentcontainer)
        return navController.navigateUp() ||  super.onSupportNavigateUp()
    }
}