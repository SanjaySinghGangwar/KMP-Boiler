package dev.sanjaygangwar.kmpboiler.routes

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import dev.sanjaygangwar.kmpboiler.ui.home.HomeScreenContent
import dev.sanjaygangwar.kmpboiler.ui.login.LoginScreenContent


object Home : Screen {
    @Composable
    override fun Content() {
        HomeScreenContent()
    }
}

object login: Screen{
    @Composable
    override fun Content() {
        LoginScreenContent()
    }
}
