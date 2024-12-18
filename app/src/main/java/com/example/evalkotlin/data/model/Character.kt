package com.example.evalkotlin.data.model

data class Character(
    val id: Int,
    val name: String,
    val role: String,
    val photoUrl: String,
    val description: String,
    val abilities: List<Ability>
)
