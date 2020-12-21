package com.example.sunmvvm.viewmodel.viewmodelhomepage

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.sunmvvm.network.model.MovieItem
import com.example.sunmvvm.reponsitory.homepagereponsitory.HomePageRepository

class HomePageViewModel : ViewModel() {

    private val repository = HomePageRepository()
    val listModelItem: LiveData<List<MovieItem>>

    init {
        this.listModelItem = repository.listMovieItem
    }

    fun showMovieItem() {
        repository.getMovieFromUrl()
    }
}
