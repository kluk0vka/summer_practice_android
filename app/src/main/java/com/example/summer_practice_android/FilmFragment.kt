package com.example.summer_practice_android

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.summer_practice_android.databinding.FragmentFilmBinding

class FilmFragment: Fragment(R.layout.fragment_film) {
    private var binding: FragmentFilmBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFilmBinding.bind(view)
        val film = FilmRepository.films.find {
            it.id == (arguments?.getInt(ARG_ID) ?: -1)
        }

        binding?.run {
            back.setOnClickListener{
                findNavController().navigate(
                    resId = R.id.action_filmFragment_to_filmsFragment
                )
            }
            if (film != null){
                tvTitle.text = film.title
                tvInfo.text = film.information
                tvYearIssue.text = "Year of issue: " + film.yearIssue.toString()
                Glide.with(imageView.context)
                    .load(film.pictureUrl)
                    .into(imageView)
            } else tvInfo.text = "ERROR"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    companion object {
        private const val ARG_ID = "ARG_ID"
        fun bundle(id: Int): Bundle = Bundle().apply {
            putInt(ARG_ID, id)
        }
    }

}