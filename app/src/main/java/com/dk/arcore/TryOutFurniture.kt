package com.dk.arcore

import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dk.arcore.databinding.FragmentHomePageBinding
import com.dk.arcore.databinding.FragmentTryOutFurnitureBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior


private const val  BOTTOM_SHEET_PEEK_HEIGHT = 50f
class TryOutFurniture : Fragment(R.layout.fragment_try_out_furniture) {

    private lateinit var binding: FragmentTryOutFurnitureBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTryOutFurnitureBinding.bind(view)
        setupBottomSheet()
    }

    private fun setupBottomSheet(){
        val bottomSheetBehavior = BottomSheetBehavior.from(binding.bottomSheet)
        bottomSheetBehavior.peekHeight = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            BOTTOM_SHEET_PEEK_HEIGHT,
            resources.displayMetrics
        ).toInt()

        bottomSheetBehavior.addBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                binding.bottomSheet.bringToFront()
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                //NO-OP
            }
        })
    }
}