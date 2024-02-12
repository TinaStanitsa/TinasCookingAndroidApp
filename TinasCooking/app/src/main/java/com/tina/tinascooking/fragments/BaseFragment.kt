package com.tina.tinascooking.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class BaseFragment : Fragment() {

    fun navigateToRecipe(id: Int, bundle: Bundle) {
        findNavController().navigate(id, bundle)
    }
}