package com.wahyuindra.viewpager2example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.wahyuindra.viewpager2example.R
import com.wahyuindra.viewpager2example.adapter.TabPagerAdapter
import com.wahyuindra.viewpager2example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.fragment_1,
            R.string.fragment_2,
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bindingTab = binding.tabs
        val bindingViewPager = binding.viewPager

        val tabPagerAdapter = TabPagerAdapter(this)
        bindingViewPager.adapter = tabPagerAdapter
        TabLayoutMediator(bindingTab, bindingViewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()

        supportActionBar?.elevation = 0f

    }
}