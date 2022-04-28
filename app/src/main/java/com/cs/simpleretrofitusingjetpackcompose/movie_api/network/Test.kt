package com.cs.simpleretrofitusingjetpackcompose.movie_api.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Test {

    val retrofitTest by lazy {

        Retrofit.Builder()
            .baseUrl("https://howtodoandroid.com/apis/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)


    }
}