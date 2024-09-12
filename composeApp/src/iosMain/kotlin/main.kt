import androidx.compose.ui.window.ComposeUIViewController
import dev.sanjaygangwar.kmpboiler.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
