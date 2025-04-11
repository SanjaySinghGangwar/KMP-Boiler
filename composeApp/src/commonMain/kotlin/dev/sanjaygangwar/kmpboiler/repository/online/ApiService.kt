package dev.sanjaygangwar.kmpboiler.repository.online

import dev.sanjaygangwar.kmpboiler.models.Characters
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class ApiService(private val client: HttpClient) {
    suspend fun fetchUsers(): List<Characters> {
        val response: HttpResponse = client.get("https://jsonplaceholder.typicode.com/users")
        return response.body()
    }
}
