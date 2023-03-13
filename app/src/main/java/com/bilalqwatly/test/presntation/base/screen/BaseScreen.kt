package com.bilalqwatly.test.presntation.base.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import com.bilalqwatly.test.ui.theme.AppTheme
import com.bilalqwatly.test.ui.widget.CirclesWidget


@Composable
fun BaseScreen(screenContent: @Composable (modifier: Modifier) -> Unit) {

    val margin = -AppTheme.dimensions.dimen112
    val size = AppTheme.dimensions.dimen230


    ConstraintLayout(modifier = Modifier.fillMaxSize()) {

        val (topCircles, bottomCircles, contentRef) = createRefs()


        //Top Circles
        CirclesWidget(modifier = Modifier
            .size(size)
            .constrainAs(topCircles) {
                top.linkTo(parent.top, margin = margin)
                end.linkTo(parent.end, margin = margin)
            })

        // Bottom Circles
        CirclesWidget(modifier = Modifier
            .size(size)
            .constrainAs(bottomCircles) {
                bottom.linkTo(parent.bottom, margin = margin)
                start.linkTo(parent.start, margin = margin)
            })

        //Screen Content
        screenContent(modifier = Modifier
            .constrainAs(contentRef) {

                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            })
    }


}