package com.example.newadvance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.newadvance.databinding.FragmentWelcomeBinding


class welcomeFragment : Fragment() {
    private lateinit var binding:FragmentWelcomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentWelcomeBinding.inflate(inflater, container, false)
        binding.lgoinbtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
        }

        binding.signup.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_signupFragment)
        }
        return binding.root
    }


}