package com.cs.simpleretrofitusingjetpackcompose.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

//    val retrofit by lazy {
//        Retrofit.Builder()
//            .baseUrl("https://howtodoandroid.com/apis/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build().create(ApiService::class.java)
//    }

    var apiService: ApiService? = null
    fun getInstance(): ApiService {
        if (apiService == null) {
            apiService = Retrofit.Builder()
                .baseUrl("https://howtodoandroid.com/apis/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiService::class.java)
        }
        return apiService!!
    }

}
