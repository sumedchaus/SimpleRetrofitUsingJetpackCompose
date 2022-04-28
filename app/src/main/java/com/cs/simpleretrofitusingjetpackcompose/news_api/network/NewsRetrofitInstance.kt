package com.cs.simpleretrofitusingjetpackcompose.news_api.network

import com.cs.simpleretrofitusingjetpackcompose.news_api.NewsConstants.NEWS_BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object NewsRetrofitInstance {


    val retrofit by lazy {

        // the most imp thing to check the error is client
        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
        Retrofit.Builder()
            .baseUrl(NEWS_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
            .create(NewsService::class.java)
    }
}