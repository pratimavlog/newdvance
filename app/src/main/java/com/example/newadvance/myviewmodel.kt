package com.example.newadvance

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class myviewmodel: ViewModel() {
    private val countlivedata=MutableLiveData<Int>()
    private val factslivedata=MutableLiveData<String>("this is live data")

    val factslive:LiveData<String>
        get() = factslivedata

    init {
        countlivedata.value=0
    }
    val counterdata:LiveData<Int>
        get()=countlivedata


    fun counterincrement()
    {
       countlivedata.value= (countlivedata.value?:0)+1
    }

    fun updatelivedata(){
        factslivedata.value="another fact"
    }

}