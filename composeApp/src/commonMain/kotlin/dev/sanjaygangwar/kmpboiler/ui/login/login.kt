package dev.sanjaygangwar.kmpboiler.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import compose.icons.FeatherIcons
import compose.icons.feathericons.Facebook
import compose.icons.feathericons.Mail
import compose.icons.feathericons.Smartphone
import compose.icons.feathericons.User
import dev.sanjaygangwar.kmpboiler.routes.Home
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreenContent(viewModel: LoginViewModel = remember { LoginViewModel() }) {
    val isLoading by viewModel.isLoading.collectAsState()
    val isLogin by viewModel.isLogin.collectAsState()

    val navigator = LocalNavigator.currentOrThrow

    LaunchedEffect(isLogin) {
        if (isLogin) {
            navigator.replace(Home)
        }
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            SignInButton(
                text = "Sign in with Google",
                icon = FeatherIcons.Mail, // Replace with Google icon if available
                color = Color(0xFFDB4437)
            ) {
                CoroutineScope(Dispatchers.Default).launch {
                    viewModel.login()
                }
            }

            SignInButton(
                text = "Sign in with Facebook",
                icon = FeatherIcons.Facebook,
                color = Color(0xFF4267B2)
            ) {
                // TODO: Facebook login
            }

            SignInButton(
                text = "Sign in with Apple",
                icon = FeatherIcons.Smartphone, // Replace with Apple icon if available
                color = Color.Black
            ) {
                // TODO: Apple login
            }

            Divider(modifier = Modifier.padding(vertical = 16.dp))

            SignInButton(
                text = "Sign in with Email",
                icon = FeatherIcons.Mail,
                color = Color.Gray
            ) {
                // TODO: Email login
            }

            SignInButton(
                text = "Sign in Anonymously",
                icon = FeatherIcons.User,
                color = Color.DarkGray
            ) {
                // TODO: Anonymous login
            }
        }

        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Composable
fun SignInButton(
    text: String,
    icon: ImageVector,
    color: Color,
    onClick: () -> Unit
) {
    Button(
        shape = ButtonDefaults.elevatedShape,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = color),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(vertical = 6.dp) // margin between buttons
    ) {
        Icon(imageVector = icon, contentDescription = null)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text)
    }
}

@Preview
@Composable
fun PreviewLoginScreen() {
    LoginScreenContent()
}
