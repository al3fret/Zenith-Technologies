package com.bilalqwatly.test.presntation.main.content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.bilalqwatly.test.R
import com.bilalqwatly.test.ui.theme.AppTheme
import com.bilalqwatly.test.ui.widget.CloseWidget


@Composable
fun ProductsAppBar(onCloseClick: () -> Unit = {}) {


    ///App Bar
    Row(
        modifier = Modifier
            .fillMaxWidth(0.9f),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(modifier = Modifier.weight(0.75f), contentAlignment = Alignment.CenterStart) {

            Column {

                Text(
                    stringResource(id = R.string.products_capital),
                    style = AppTheme.typography.robotoSemiBoldFont28

                )





            }
        }
        Box(modifier = Modifier.weight(0.25f), contentAlignment = Alignment.CenterEnd) {
            CloseWidget(onCloseClick)
        }

    }


}