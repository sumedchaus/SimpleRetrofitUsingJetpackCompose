package com.cs.simpleretrofitusingjetpackcompose.news_api.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.cs.simpleretrofitusingjetpackcompose.movie_api.model.Movie
import com.cs.simpleretrofitusingjetpackcompose.movie_api.screen.MovieItem
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.Article
import com.cs.simpleretrofitusingjetpackcompose.news_api.model.NewsModel
import com.cs.simpleretrofitusingjetpackcompose.news_api.view_model.NewsViewModel


@Composable
fun NewsScreen(newsViewModel: NewsViewModel = NewsViewModel()) {

    NewsList(newsList = newsViewModel.newsResponse.articles)
}

@Composable
fun NewsList(newsList: List<Article>) {
    LazyColumn {

        items(newsList) { item ->
            NewsListItem(article = item)
//            Text(text = item.title)
        }
    }
}
@Composable
fun NewsListItem(article: Article) {

    Text(text = article.title)

}