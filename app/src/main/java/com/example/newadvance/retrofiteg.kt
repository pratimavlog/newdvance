package com.example.newadvance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.newadvance.databinding.ActivityRetrofitegBinding
import retrofit2.Response

class retrofiteg : AppCompatActivity() {
    private lateinit var binding:ActivityRetrofitegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityRetrofitegBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofitservice=RetrofitInstance.getRetrofitInstance().create(AlbumServies::class.java)

        val responselivedata:LiveData<Response<Albums>> =
        liveData {
            val response=retrofitservice.getAlbums()
            emit(response)

        }
        responselivedata.observe(this, Observer {
            val albumlist=it.body()?.listIterator()
            if(albumlist!= null)
            {
                while (albumlist.hasNext()){
                    val albumitem=albumlist.next()
                    val albumTitle="Album Title: ${albumitem.title} \n"
                    binding.texttitle.append(albumTitle)
                }
            }
        })

    }
}