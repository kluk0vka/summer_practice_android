package com.example.summer_practice_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.summer_practice_android.databinding.FragmentFilmsBinding
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import androidx.recyclerview.widget.LinearLayoutManager


class FilmsFragment : Fragment(R.layout.fragment_films) {

    private var binding: FragmentFilmsBinding? = null
    private var adapter: FilmAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFilmsBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter() {
        binding?.run {
            adapter = FilmAdapter(
                list = FilmRepository.films,
                glide = Glide.with(this@FilmsFragment),
                onClick = {
                    findNavController().navigate(
                        resId = R.id.action_filmsFragment_to_filmFragment,
                        args = FilmFragment.bundle(id = it.id)
                    )
                }
            )
            rvFilm.adapter = adapter
            rvFilm.layoutManager = LinearLayoutManager(requireContext())

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}