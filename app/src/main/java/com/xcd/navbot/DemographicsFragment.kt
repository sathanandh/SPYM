package com.xcd.navbot

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.xcd.navbot.databinding.FragmentDemographicsBinding

class Demographics : Fragment() {

    private lateinit var binding: FragmentDemographicsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDemographicsBinding.inflate(inflater, container, false)
        val drugs = resources.getStringArray(R.array.drugs)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, drugs)

        binding.autoComplete.setAdapter(arrayAdapter)


        return binding.root




        /**
        return inflater.inflate(R.layout.fragment_demographics, container, false)
        **/
    }


}