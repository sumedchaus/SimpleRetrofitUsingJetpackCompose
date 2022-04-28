package com.cs.simpleretrofitusingjetpackcompose.using_callback.anime_api.model

data class Saga(
    val descriptions: DescriptionsX,
    val episode_from: Int,
    val episode_to: Int,
    val episodes_count: Int,
    val titles: Titles
)