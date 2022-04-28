package com.cs.simpleretrofitusingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cs.simpleretrofitusingjetpackcompose.movie_api.screen.MovieList
import com.cs.simpleretrofitusingjetpackcompose.ui.theme.SimpleRetrofitUsingJetpackComposeTheme
import com.cs.simpleretrofitusingjetpackcompose.movie_api.view_model.MainViewModel
import com.cs.simpleretrofitusingjetpackcompose.news_api.screen.NewsScreen
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.screen.AnimeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleRetrofitUsingJetpackComposeTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    HomeScreen()
//                    NewsScreen()
                    AnimeScreen()
                }
            }
        }
    }
}


