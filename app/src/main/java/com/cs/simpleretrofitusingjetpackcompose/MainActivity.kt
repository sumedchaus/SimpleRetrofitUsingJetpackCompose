package com.cs.simpleretrofitusingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cs.simpleretrofitusingjetpackcompose.model.Movie
import com.cs.simpleretrofitusingjetpackcompose.screen.MovieList
import com.cs.simpleretrofitusingjetpackcompose.ui.theme.SimpleRetrofitUsingJetpackComposeTheme
import com.cs.simpleretrofitusingjetpackcompose.view_model.MainViewModel

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
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(viewModel: MainViewModel = MainViewModel()) {
    MovieList(movieList = viewModel.movieListResponse)
}
