package com.example.sunmvvm.network.retrofit


import com.example.sunmvvm.network.model.ModelItem
import com.example.sunmvvm.utils.Constant
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiConnected {
    @GET(Constant.UPCOMING_URL)
    fun getMovieFromUrl(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<ModelItem>
}
