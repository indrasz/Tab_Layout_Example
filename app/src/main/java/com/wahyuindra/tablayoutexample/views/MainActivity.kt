package com.wahyuindra.tablayoutexample.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyuindra.tablayoutexample.adapter.TabPagerAdapter
import com.wahyuindra.tablayoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabPagerAdapter = TabPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = tabPagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        supportActionBar?.elevation = 0f
    }
}