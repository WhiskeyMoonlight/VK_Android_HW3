package com.example.hw3

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ArticleAdapter(
    fragment: MainActivity,
    private val articles: List<ArticleResponse>
): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = articles.size

    override fun createFragment(position: Int): Fragment {
        val fragment = MainFragment()
        val current = articles[position]
        fragment.arguments = Bundle().apply {
            putString(TITLE, current.title)
            putString(DESCRIPTION, current.description)
            putString(CAPTION, current.caption)
        }
//
//        MainFragment.newInstance(current).apply {
//            arguments = bundleOf(
//                TITLE to current.title,
//                DESCRIPTION to current.description,
//                CAPTION to current.caption
//                )
//        }

        return fragment
    }

}