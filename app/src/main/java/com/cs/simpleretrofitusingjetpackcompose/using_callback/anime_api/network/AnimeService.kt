package com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.network

import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.model.AnimeModel
import retrofit2.Call
import retrofit2.http.GET

interface AnimeService {

    @GET("v1/anime")
    fun getAnimeFromApi() : Call<AnimeModel>
}