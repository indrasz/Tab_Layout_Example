package com.wahyuindra.viewpager2example.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.wahyuindra.viewpager2example.views.fragment.FragmentOne

class TabPagerAdapter(activity : AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        val fragment = FragmentOne()
        fragment.arguments = Bundle().apply {
            putInt(FragmentOne.ARG_SECTIONS_NUMBER, position + 1)
        }
        return fragment
    }

    override fun getItemCount(): Int = 2
}