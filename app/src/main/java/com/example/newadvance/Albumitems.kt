package com.example.newadvance

import com.google.gson.annotations.SerializedName


data class Albumitems(
    @SerializedName("id")
    var id:Int,

    @SerializedName("userId")
    var userId:Int,

    @SerializedName("title")
    var title:String

)
