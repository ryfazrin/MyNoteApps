package com.ryfazrin.mynoteapps.entity

data class Note(
    var id: Int = 0,
    var title: String? = null,
    var description: String? = null,
    var date: String? = null
)
