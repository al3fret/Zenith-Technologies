package com.bilalqwatly.test.presntation.base.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.bilalqwatly.test.R
import com.bilalqwatly.test.ui.theme.AppTheme
import com.bilalqwatly.test.ui.theme.ColorBackground
import com.bilalqwatly.test.ui.theme.ColorError


@Composable
fun ErrorPage(
    modifier: Modifier = Modifier, message: String, onClick: () -> Unit = {}
) {


    val focusManager = LocalFocusManager.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(all = AppTheme.dimensions.dimen20)
            .background(
                ColorBackground
            ),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id
            = R.drawable.ic_error),
            contentDescription = "error",
            Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
        )


        Text(text = message, style = AppTheme.typography.robotoNormalTextFont18)
        Spacer(modifier = Modifier.height(AppTheme.dimensions.dimen20))

        Button(

            onClick = onClick, modifier = modifier.clickable(
                interactionSource = MutableInteractionSource(),
                indication = rememberRipple(bounded = true,
                    color = ColorBackground)
            )
            {

                focusManager.clearFocus()
                onClick()
            },


            contentPadding = PaddingValues(vertical = AppTheme.dimensions.dimen5),
            colors = ButtonDefaults.buttonColors(containerColor = ColorError),
            shape = RoundedCornerShape(AppTheme.dimensions.dimen3),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = AppTheme.dimensions.dimen1,
            ),
        ) {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(AppTheme.dimensions.dimen3))
                        .then(modifier.padding(vertical = AppTheme.dimensions.dimen5)),

                    contentAlignment = Alignment.Center,
                ) {
                    Text(text = stringResource(id = R.string.retry),
                        style =  AppTheme.typography.robotoNormalWhite20)
                }
            }

        }
    }
