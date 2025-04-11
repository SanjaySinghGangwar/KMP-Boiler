package dev.sanjaygangwar.kmpboiler.repository.online


import dev.sanjaygangwar.kmpboiler.models.Characters

interface UserRepository {
    suspend fun getUsers(): List<Characters>
}
