package com.amrhal.discovermovieskt.data.remote

import retrofit2.Retrofit


object RetrofitClientInstance {
    private val base_url = "http://ec2-35-162-111-46.us-west-2.compute.amazonaws.com/courses_lumen/public/"
    private var retrofit: Retrofit? = null

    fun getInstance(): Retrofit? {

        if (retrofit == null) {

            retrofit = Retrofit.Builder()
                .baseUrl(base_url)
                .build()

            return retrofit
        } else
            return retrofit
    }

}