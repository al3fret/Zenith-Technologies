package com.bilalqwatly.test.ui.theme


import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext
import com.bilalqwatly.test.util.dimens.WindowType
import com.bilalqwatly.test.util.dimens.expandDimensions
import com.bilalqwatly.test.util.dimens.mediumCompactDimensions
import com.bilalqwatly.test.util.dimens.rememberWindowSize
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorScheme = darkColorScheme(
    primary = ColorPrimary,
    secondary = ColorSecondary,
    tertiary = ColorPrimary,
    background = ColorBackground

)

private val LightColorScheme = lightColorScheme(
    primary = ColorPrimary,
    secondary = ColorSecondary,
    tertiary = ColorPrimary,
    background = ColorBackground

)


private val LocalAppDimens = staticCompositionLocalOf {
    mediumCompactDimensions
}

val LocalSimpleTypography = staticCompositionLocalOf { MyTypography() }

object AppTheme {
    val dimensions
        @Composable
        @ReadOnlyComposable
        get() = LocalAppDimens.current

    val typography
        @Composable
        @ReadOnlyComposable
        get() = LocalSimpleTypography.current

}

@Composable
fun BilalQwatlyTestTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val colorScheme = pickColorScheme(dynamicColor, darkTheme)


    val systemUiController = rememberSystemUiController()
    if (darkTheme) {
        systemUiController.setSystemBarsColor(
            color = colorScheme.background,
            darkIcons = true,
            isNavigationBarContrastEnforced = true
        )

        systemUiController.setNavigationBarColor(
            color = colorScheme.background,
            darkIcons = true,
            navigationBarContrastEnforced = true
        )


    } else {
        systemUiController.setSystemBarsColor(
            color = colorScheme.background,
            darkIcons = true,
            isNavigationBarContrastEnforced = true
        )

        systemUiController.setNavigationBarColor(
            color = colorScheme.background,
            darkIcons = true,
            navigationBarContrastEnforced = true
        )

    }


    val windowSize = rememberWindowSize()


    val dimensions = when (windowSize.height) {
        WindowType.Compact -> mediumCompactDimensions
        WindowType.Medium -> mediumCompactDimensions
        WindowType.Expanded -> expandDimensions
    }



    CompositionLocalProvider(
        LocalAppDimens provides dimensions,
        LocalSimpleTypography provides MyTypography(),
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            shapes = Shapes,
            content = content,
        )
    }


}

@Composable
fun pickColorScheme(
    dynamicColor: Boolean,
    darkTheme: Boolean
): ColorScheme {
    return when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

}