package com.tina.tinascooking.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.tina.tinascooking.R
import com.tina.tinascooking.viewmodels.RecipeViewModel
import com.tina.tinascooking.adapters.RecipesAdapter
import com.tina.tinascooking.databinding.FragmentMainCoursesBinding

class MainCoursesFragment : BaseFragment() {

    val viewModel = RecipeViewModel()

    private var _binding: FragmentMainCoursesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainCoursesBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(requireContext())
        binding.latestRecipesRecyclerView.layoutManager = layoutManager
        binding.latestRecipesRecyclerView.adapter =
            RecipesAdapter(viewModel.getMainCourses(), ::navigateTo)
        initListeners()
    }

    private fun initListeners() {

        binding.ivBackButton.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun navigateTo(bundle: Bundle) {
        navigateToRecipe(R.id.action_mainCoursesFragment_to_recipeFragment, bundle)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}