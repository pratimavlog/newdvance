package com.example.newadvance


import retrofit2.http.GET
import retrofit2.Response

interface AlbumServies {
    @GET("/albums")
    suspend fun getAlbums() : Response<Albums>

}