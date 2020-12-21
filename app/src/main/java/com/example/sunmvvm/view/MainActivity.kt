package com.example.sunmvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sunmvvm.R
import com.example.sunmvvm.view.homepage.adapter.HomePageFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initFragmentHomePage()
    }

    private fun initFragmentHomePage() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frameHomeMain, HomePageFragment.newInstance()).commit()
    }
}
