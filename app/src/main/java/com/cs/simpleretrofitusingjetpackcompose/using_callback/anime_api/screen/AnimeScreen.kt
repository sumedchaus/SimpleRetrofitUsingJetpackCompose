package com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.model.Document
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.view_model.AnimeViewModel

@Composable
fun AnimeScreen(animeViewModel: AnimeViewModel = AnimeViewModel()) {

    if (animeViewModel.loadData.value) {
        AnimeList(animeLists = animeViewModel.animeResponse.data.documents)
    }
}

@Composable
fun AnimeList(animeLists: List<Document>) {

    LazyColumn {
        items(animeLists) { item ->
            AnimeListItem(document = item)
        }
    }
}

@Composable
fun AnimeListItem(document: Document) {

    Card(modifier = Modifier.padding(12.dp)) {
        Text(text = document.start_date)
    }

}