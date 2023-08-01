package com.dk.arcore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dk.arcore.databinding.FragmentHomePageBinding

class HomePage : Fragment(R.layout.fragment_home_page) {

    private lateinit var binding: FragmentHomePageBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomePageBinding.bind(view)

        binding.btnTryFurniture.setOnClickListener {
            println("Try Furniture Mode")
            findNavController().navigate(R.id.action_homePage_to_tryOutFurniture)
        }
    }
}