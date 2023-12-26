package com.example.hw3

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ArticleAdapter(
    fragment: FragmentActivity,
    ): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val fragment = MainFragment()
        fragment.arguments = Bundle().apply {
            putInt(ID, position + 1)
        }
        return fragment
    }
}