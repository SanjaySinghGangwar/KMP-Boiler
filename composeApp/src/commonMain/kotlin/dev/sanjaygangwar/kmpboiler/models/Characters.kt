package dev.sanjaygangwar.kmpboiler.models

data class Characters(
    val _id: String,
    val episodes: List<String>,
    val id: String,
    val location: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
)