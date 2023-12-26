package com.example.hw3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment



const val ID = "id"
const val TITLE = "title "
const val DESCRIPTION = "description "
const val CAPTION = "caption "

class MainFragment: Fragment(R.layout.main_fragment) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ID) }?.apply {
            val titleTV: TextView = view.findViewById(R.id.title_tv__main_fragment)
            titleTV.text = TITLE + getInt(ID).toString()
            val descTV: TextView = view.findViewById(R.id.description_tv__main_fragment)
            descTV.text = DESCRIPTION + getInt(ID).toString()
            val captionTV: TextView = view.findViewById(R.id.caption_tv__main_fragment)
            captionTV.text = CAPTION + getInt(ID).toString()

        }


    }


}