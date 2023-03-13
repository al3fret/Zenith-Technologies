package com.bilalqwatly.test.presntation.base.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import com.airbnb.lottie.compose.*
import com.bilalqwatly.test.R
import com.bilalqwatly.test.ui.theme.AppTheme
import com.bilalqwatly.test.ui.theme.ColorBackground70


@Composable
fun LoadingScreen(modifier: Modifier = Modifier) {
    val composition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.loading
        )
    )
    val lottieProgress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever
    )

    BoxWithConstraints(
        modifier = modifier
            .fillMaxSize()
            .pointerInput(Unit) {}
            .background(
                ColorBackground70
            ),

        contentAlignment = Alignment.Center,

        ) {
        LottieAnimation(
            modifier = modifier
                .size(AppTheme.dimensions.dimen200),
            composition = composition,
            progress = lottieProgress,


            )
    }
}
