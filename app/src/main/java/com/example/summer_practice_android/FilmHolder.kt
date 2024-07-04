package com.example.summer_practice_android

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.summer_practice_android.databinding.ItemFilmBinding

class FilmHolder (
    private val binding: ItemFilmBinding,
    private val glide: RequestManager,
    private val onClick: (Film) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private val context: Context
        get() = itemView.context

    fun onBind(film: Film) {
        binding.run {
            tvTitle.text = film.title
            tvYearIssue.text = film.yearIssue.toString()

            glide
                .load(film.pictureUrl)
                .error(R.drawable.img_not_found)
                .placeholder(R.drawable.img)
                .apply(requestOptions)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(film)
            }

            tvYearIssue.setTextColor(context.getColor(R.color.blue))
        }
    }
}