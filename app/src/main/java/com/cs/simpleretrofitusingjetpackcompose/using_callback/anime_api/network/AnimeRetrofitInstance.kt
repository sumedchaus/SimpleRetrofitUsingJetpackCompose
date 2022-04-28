package com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object AnimeRetrofitInstance {

    var animeService : AnimeService? = null

    fun getAnimeInstance() : AnimeService{

        if (animeService == null){

            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()
            animeService = Retrofit.Builder()
                .baseUrl("https://api.aniapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build()
                .create(AnimeService::class.java)
        }

        return animeService!!

    }

}