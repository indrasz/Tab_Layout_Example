package com.wahyuindra.viewpager2example.views.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wahyuindra.viewpager2example.R
import com.wahyuindra.viewpager2example.databinding.FragmentOneBinding
import com.wahyuindra.viewpager2example.utils.ARG_SECTIONS_NUMBER

class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val index = arguments?.getInt(ARG_SECTIONS_NUMBER, 0)

        binding.labelFragment1.text = getString(R.string.content_tab_text, index)

    }

}