package com.cs.simpleretrofitusingjetpackcompose.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cs.simpleretrofitusingjetpackcompose.model.Movie
import com.cs.simpleretrofitusingjetpackcompose.network.RetrofitInstance
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var movieListResponse: List<Movie> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")

    init {
        getMovieList()
    }

     fun getMovieList() {
        viewModelScope.launch {
//            val apiService = ApiService.getInstance() // from api service
//            val apiService = RetrofitInstance.retrofit // retrofit instance 2nd method

            val apiService = RetrofitInstance.getInstance()   // from retrofit instance
            try {
                val movieList = apiService.getMovies()
                movieListResponse = movieList
            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}