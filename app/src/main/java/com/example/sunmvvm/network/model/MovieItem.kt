package com.example.sunmvvm.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MovieItem(
    @SerializedName("title")
    @Expose
    val name: String,
    @SerializedName("poster_path")
    @Expose
    val photo: String,
    @SerializedName("vote_average")
    @Expose
    val vote: Double
)
