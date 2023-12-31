package com.example.hw3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment


const val ID = "id"
const val TITLE = "title"
const val DESCRIPTION = "description"
const val CAPTION = "caption"
const val CONTENTS = "contents"
const val IMAGE_ID = "image_id"


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
        arguments?.apply {
            val titleTV: TextView = view.findViewById(R.id.title_tv__main_fragment)
            titleTV.text = getString(TITLE)
            val descTV: TextView = view.findViewById(R.id.description_tv__main_fragment)
            descTV.text = getString(DESCRIPTION)
            val captionTV: TextView = view.findViewById(R.id.caption_tv__main_fragment)
            captionTV.text = getString(CAPTION)
            val imageView: ImageView = view.findViewById(R.id.avatar)
            imageView.setImageResource(getInt(IMAGE_ID))
        }
        val more_button = view.findViewById<Button>(R.id.button_more)
        more_button.setOnClickListener {
            val intent = Intent(it.context, SecondActivity::class.java)
            Log.d("MY_TAG", arguments?.getInt(ID).toString())
            intent.putExtra(ID, arguments?.getInt(ID))
            context?.startActivity(intent)
        }
    }

    companion object {
        fun newInstance(article: ArticleResponse) = MainFragment().apply {
            arguments = bundleOf(
                ID to article.id,
                TITLE to article.title,
                DESCRIPTION to article.description,
                CAPTION to article.caption,
                IMAGE_ID to article.imageId
            )
        }
    }

}