package com.example.sunmvvm.reponsitory.homepagereponsitory

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.sunmvvm.network.model.ModelItem
import com.example.sunmvvm.network.model.MovieItem
import com.example.sunmvvm.network.retrofit.ApiConnected
import com.example.sunmvvm.utils.Constant
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HomePageRepository {

    var listMovieItem = MutableLiveData<List<MovieItem>>()

    fun getMovieFromUrl() {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val apiRetrofit = retrofit.create(ApiConnected::class.java)
        apiRetrofit.getMovieFromUrl(Constant.API_KEY, Constant.LANGUAGE, Constant.PAGE)
            .enqueue(object : Callback<ModelItem> {
                override fun onResponse(
                    call: Call<ModelItem>,
                    response: Response<ModelItem>
                ) {
                    listMovieItem.value = response.body()?.resultsApi

                }

                override fun onFailure(call: Call<ModelItem>, t: Throwable) {
                    t.message?.let { Log.e("error", it) }
                }
            })
    }
}
