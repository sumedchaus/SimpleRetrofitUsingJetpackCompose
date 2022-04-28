package com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.view_model

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.model.AnimeModel
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.model.Data
import com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.network.AnimeRetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AnimeViewModel : ViewModel() {

    var animeResponse =
        AnimeModel(
            version = "",
            data = Data(count = 0, current_page = 0, documents = listOf(), last_page = 0),
            message = "",
            status_code = 0
        )

    var loadData = mutableStateOf(false)

    init {
        getAnime()
    }

    private fun getAnime() {

        val animeApi  = AnimeRetrofitInstance.getAnimeInstance()
        val anime: Call<AnimeModel> = animeApi.getAnimeFromApi()

        anime.enqueue(object : Callback<AnimeModel> {
            override fun onResponse(call: Call<AnimeModel>, response: Response<AnimeModel>) {

                if (response.isSuccessful) {
                    val data = response.body()
                    if (data != null) {
                        animeResponse = data
                        loadData.value = true
                    }
                }
            }

            override fun onFailure(call: Call<AnimeModel>, t: Throwable) {
                Log.d("Error", t.message.toString())
            }

        })
    }
}