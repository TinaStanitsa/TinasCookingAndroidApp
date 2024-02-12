package com.tina.tinascooking.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tina.tinascooking.R
import com.tina.tinascooking.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.latestRecipesButton.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_latestRecipesFragment)
        }

        binding.mainCourses.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_mainCoursesFragment)
        }

        binding.desserts.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_dessertsFragment)
        }
    }

}