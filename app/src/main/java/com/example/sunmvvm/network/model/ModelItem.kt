package com.example.sunmvvm.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ModelItem(
    @Expose
    @SerializedName("results")
    val resultsApi: List<MovieItem>,
)
