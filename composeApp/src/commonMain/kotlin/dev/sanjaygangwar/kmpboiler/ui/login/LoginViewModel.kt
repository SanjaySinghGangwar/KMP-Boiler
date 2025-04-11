package dev.sanjaygangwar.kmpboiler.ui.login

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LoginViewModel : ViewModel() {

    private val _isLogin = MutableStateFlow(false)
    val isLogin: StateFlow<Boolean> = _isLogin

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    suspend fun login() {
        _isLoading.value = true
        delay(5000)
        // Simulate a login process
        _isLogin.value = true
        _isLoading.value = false
    }

    suspend fun googleSignIn() {
        _isLoading.value = true
    }
}