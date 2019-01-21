package com.amrhal.discovermovieskt.data.remote

import android.arch.lifecycle.LiveData
import android.util.Log

import com.google.gson.Gson
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ServiceRepo {

    //https://proandroiddev.com/mvvm-architecture-viewmodel-and-livedata-part-1-604f50cda1

//    val retrofit = RetrofitClientInstance.getInstance()?.create(CoursesApi::class.java)
//
//    fun getTopRated(): LiveData<Movie> {
//
//        val data = MutableLiveData<Movie>()
//
//        retrofit?.getTopRatedMovies(BuildConfig.API_KEY)?.enqueue(object : Callback<ResponseBody> {
//            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                val MResponse:String? = response.body()?.string()
//                val gson = Gson()
//                val movie = gson.fromJson(MResponse, Movie::class.java)
//                data.value = movie
//            }
//            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                Log.e("tag","onFailure throw : ${t.localizedMessage}")
//            }
//        })
//
//        return data
//    }


}
