package com.example.newadvance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.newadvance.databinding.ActivityLivedataBinding

class livedata : AppCompatActivity() {
    private lateinit var bindding:ActivityLivedataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        bindding=ActivityLivedataBinding.inflate(layoutInflater)
        setContentView(bindding.root)
        var viewmodel:myviewmodel=ViewModelProvider(this).get(myviewmodel::class.java)

        viewmodel.counterdata.observe(this, {count ->
            bindding.livetv.text="$count"
        })

        viewmodel.factslive.observe(this, Observer {
            bindding.tvlive.text=it
        })
        bindding.livebtn2.setOnClickListener {
            viewmodel.updatelivedata()
        }

        bindding.livebtn.setOnClickListener {
            viewmodel.counterincrement()
        }

    }
}