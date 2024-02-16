package com.al.astronauts.model

data class AstronautsResponse(
    val message: String,
    val number: Int,
    val people: List<People>
)

data class People(
    val craft: String,
    val name: String
)