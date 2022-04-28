package com.cs.simpleretrofitusingjetpackcompose.news_api.model

data class NewsModel(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)