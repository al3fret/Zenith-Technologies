package com.bilalqwatly.test


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bilalqwatly.test.route.AppNavigationGraph
import com.bilalqwatly.test.ui.theme.BilalQwatlyTestTheme
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import dagger.hilt.android.AndroidEntryPoint


@ExperimentalAnimationApi
@ExperimentalMaterial3Api
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    companion object {
        const val splashFadeDurationMillis = 600
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // Splash Screen
        val splashWasDisplayed = savedInstanceState != null
        if (!splashWasDisplayed)
            customInstallSplashScreen(installSplashScreen())

        setContent {
            BilalQwatlyTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AppNavigationGraph(
                        navHostController = navController
                    )
                }
            }
        }
    }
}


@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterial3Api::class)
fun customInstallSplashScreen(
    splashScreen: androidx.core.splashscreen.SplashScreen,
) {

    splashScreen.setOnExitAnimationListener { splashScreenViewProvider ->
        // Get logo and start a fade out animation

        splashScreenViewProvider.iconView
            .animate()
            .setDuration(
                MainActivity.splashFadeDurationMillis.toLong()
            )
            .alpha(0f)
            .withEndAction {
                // After the fade out, remove the
                // splash and set content view
                splashScreenViewProvider.remove()
            }.start()
    }


}