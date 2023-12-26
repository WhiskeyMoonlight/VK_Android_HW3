package com.example.hw3

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object Controller {

    val scope = CoroutineScope(Dispatchers.IO)
    val art1 = ArticleResponse(
        "ART1",
        "DESC1",
        "CAP1",
        "CONT1",
    )
    val art2 = ArticleResponse(
        "ART2",
        "DESC2",
        "CAP2",
        "CONT2",
    )
    val art3 = ArticleResponse(
        "ART3",
        "DESC3",
        "CAP3",
        "CONT3",
    )

    val articlePool = listOf(
        art1, art2, art3, art1, art2, art3, art1, art2, art3,
    )



    fun loadData(callback: (result: List<ArticleResponse>) -> Unit) {
        scope.launch {
            delay(2000L)
            withContext(Dispatchers.Main) {
                callback(articlePool)
            }

        }
    }

}