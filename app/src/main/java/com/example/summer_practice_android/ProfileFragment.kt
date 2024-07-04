package com.example.summer_practice_android

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summer_practice_android.databinding.FragmentProfileBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private var binding: FragmentProfileBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)

        val your_name = arguments?.getString(NAME) ?: "ERROR"

        binding?.run {
            skreenpofile.text = "${skreenpofile.text} : \n $your_name"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        private const val NAME = "NAME"

        fun bundle(your_name: String): Bundle = Bundle().apply {
            putString(NAME, your_name)
        }
    }

}