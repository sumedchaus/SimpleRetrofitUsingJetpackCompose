package com.cs.simpleretrofitusingjetpackcompose.movie_api.network

import com.cs.simpleretrofitusingjetpackcompose.movie_api.model.Movie
import retrofit2.http.GET

interface ApiService {

    @GET("movielist.json")
    suspend fun getMovies() : List<Movie>


//    companion object {
//        var apiService: ApiService? = null
//        fun getInstance() : ApiService {
//            if (apiService == null) {
//                apiService = Retrofit.Builder()
//                    .baseUrl("https://howtodoandroid.com/apis/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build().create(ApiService::class.java)
//            }
//            return apiService!!
//        }
//    }

}