package com.example.hw3

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

object Controller {

    val scope = CoroutineScope(Dispatchers.IO)
    val art1 = ArticleResponse("ART1",
        "DESC1",
        "CAP1",
        "CONT1",
        )

//    fun loadData(callback: (result: ))

}