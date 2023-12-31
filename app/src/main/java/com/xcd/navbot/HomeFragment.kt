package com.xcd.navbot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xcd.navbot.databinding.FragmentAddBinding
import com.xcd.navbot.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        /**
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
        **/
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}