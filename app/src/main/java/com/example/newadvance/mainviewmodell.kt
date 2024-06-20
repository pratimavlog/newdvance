package com.example.newadvance

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class mainviewmodell:ViewModel() {
    val factslivedata=MutableLiveData<String>("this is live data")

}