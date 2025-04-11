package dev.sanjaygangwar.kmpboiler

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import dev.sanjaygangwar.kmpboiler.routes.Home
import dev.sanjaygangwar.kmpboiler.routes.login

@Composable
fun App() {
    Navigator(login)
}
