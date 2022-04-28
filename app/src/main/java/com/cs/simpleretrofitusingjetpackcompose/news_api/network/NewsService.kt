package com.cs.simpleretrofitusingjetpackcompose.news_api.network

import com.cs.simpleretrofitusingjetpackcompose.news_api.NewsConstants.NEWS_API_KEY
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.Article
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.NewsModel
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {


    @GET("/v2/top-headlines")
    suspend fun getNewsFromApi(
        @Query("country")
        country: String = "in",
        @Query("apikey")
        apikey:String
    ): NewsModel
}