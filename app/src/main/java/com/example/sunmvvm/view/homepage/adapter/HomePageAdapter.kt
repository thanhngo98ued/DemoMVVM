package com.example.sunmvvm.view.homepage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sunmvvm.R
import com.example.sunmvvm.network.model.MovieItem

class HomePageAdapter(private val listMovieItem: List<MovieItem>) :
    RecyclerView.Adapter<ViewHolderHomePage>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderHomePage {
        return ViewHolderHomePage(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_movie_grid_layout, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolderHomePage, position: Int) {
        holder.bindData(listMovieItem[position])
    }

    override fun getItemCount(): Int {
        return listMovieItem.size
    }
}
