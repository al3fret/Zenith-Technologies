package com.bilalqwatly.test.ui.widget

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.bilalqwatly.test.R
import com.bilalqwatly.test.ui.theme.AppTheme
import com.bilalqwatly.test.ui.theme.ColorBorder
import com.bilalqwatly.test.ui.theme.ColorPrimary


@Composable
fun CloseWidget(onClick: () -> Unit = {}) {

    Card(
        modifier = Modifier
            .size(AppTheme.dimensions.dimen40)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(color = Color.White)
            ) {

                onClick()

            },
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(
            defaultElevation = AppTheme.dimensions.dimen6
        ),
        border = BorderStroke(AppTheme.dimensions.dimen1, ColorPrimary),
        colors = CardDefaults.cardColors(containerColor = ColorBorder)
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_logout),
            contentDescription = "login_arrow",
            modifier = Modifier.padding(AppTheme.dimensions.dimen10)

        )
    }
}
