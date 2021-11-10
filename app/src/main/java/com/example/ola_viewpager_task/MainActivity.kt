package com.example.ola_viewpager_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numbers = listOf("1", "2", "3", "4")

        val cardViewPagerAdapter = CardViewPagerAdapter(numbers)
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        viewPager.adapter = cardViewPagerAdapter
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

    }
}