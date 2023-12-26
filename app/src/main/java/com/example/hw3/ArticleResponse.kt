package com.example.hw3

data class ArticleResponse(
    val id: Int,
    val title: String,
    val description: String,
    val caption: String,
    val contents: String,
    val imageId: Int,
)