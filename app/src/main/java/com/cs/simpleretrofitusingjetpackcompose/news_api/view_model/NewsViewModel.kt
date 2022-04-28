package com.cs.simpleretrofitusingjetpackcompose.news_api.view_model

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.cs.simpleretrofitusingjetpackcompose.news_api.NewsConstants.NEWS_API_KEY
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.Article
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.NewsModel
import com.cs.simpleretrofitusingjetpackcompose.news_api.network.NewsRetrofitInstance
import kotlinx.coroutines.launch
import java.lang.Exception

class NewsViewModel : ViewModel() {


//    var newsResponse: List<Article> by mutableStateOf(listOf())
    var newsResponse: NewsModel by mutableStateOf(NewsModel(articles = listOf(), totalResults = 0, status = ""))
    var errorMessage: String by mutableStateOf("")



    init {
        getNews()
    }


    fun getNews(){

        viewModelScope.launch {
           val retrofit = NewsRetrofitInstance.retrofit

           try {
               val newsList =  retrofit.getNewsFromApi("in",NEWS_API_KEY)
               newsResponse = newsList
               print(newsResponse)

               Log.d("NewsResponse", newsResponse.toString())

           } catch (e: Exception){
               errorMessage = e.message.toString()
           }

        }
    }

}