package com.tina.tinascooking.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tina.tinascooking.R
import com.tina.tinascooking.viewmodels.RecipeViewModel
import com.tina.tinascooking.databinding.FragmentRecipeBinding
import com.tina.tinascooking.utilities.loadImageUrl


class RecipeFragment : Fragment() {


    private val viewModel = RecipeViewModel()
    private var _binding: FragmentRecipeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeBinding.inflate(inflater, container, false)
        return binding.root


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvRecipeTitle.text = arguments?.getString("recipe_title")
        binding.tvRecipeInstructions.text = arguments?.getString("execution")
        binding.ivRecipe.loadImageUrl(arguments?.getString("imageURL"), R.drawable.mousakas)
        initListeners()
    }

    private fun initListeners() {
        binding.ivBackButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}