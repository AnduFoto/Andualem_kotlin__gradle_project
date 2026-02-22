package org.dbu.library.model

data class Book(
        val isbn: String,
        val title: String,
        val author: String,
        val year: Int,
        var isAvailable: Boolean = true
)