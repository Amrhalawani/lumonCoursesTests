package com.amrhal.discovermovieskt.data.remote

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface CoursesApi {

    @GET("")
    fun getAny(@Query("api_key") apiKey: String): Call<ResponseBody>

   // @Header("Content-Type: application/json")/
    @POST("/login")
    fun getAny(): Call<ResponseBody>



}

