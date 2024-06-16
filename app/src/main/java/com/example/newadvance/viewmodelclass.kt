package com.example.newadvance

import androidx.lifecycle.ViewModel

class viewmodelclass:ViewModel() {
    var number = 0


    fun addOne():Int {
       return ++number
    }
}