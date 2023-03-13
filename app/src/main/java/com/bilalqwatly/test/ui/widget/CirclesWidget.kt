package com.bilalqwatly.test.ui.widget

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.bilalqwatly.test.ui.theme.*

@Composable
fun CirclesWidget(modifier: Modifier) {

    val firstCircle = AppTheme.dimensions.dimen200.value
    val secondCircle = AppTheme.dimensions.dimen160.value
    val thirdCircle = AppTheme.dimensions.dimen120.value
    val fourthCircle = AppTheme.dimensions.dimen80.value



    Canvas(modifier = modifier) {
        drawCircle(
            color = ColorPrimary4,
            radius = firstCircle
        )
        drawCircle(
            color = ColorPrimary3,
            radius = secondCircle
        )
        drawCircle(
            color = ColorPrimary2,
            radius = thirdCircle
        )
        drawCircle(
            color = ColorPrimary1,
            radius = fourthCircle
        )
    }
}

