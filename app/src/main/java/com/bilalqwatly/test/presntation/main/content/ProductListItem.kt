package com.bilalqwatly.test.presntation.main.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.bilalqwatly.test.R
import com.bilalqwatly.test.domin.entites.Product
import com.bilalqwatly.test.ui.theme.AppTheme


@Composable
fun ProductListItem(product: Product) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {


        Text(text = product.name!!, style = AppTheme.typography.robotoNormalTextFont16)

        Text(
            text = "${product.price!!} ${stringResource(id = R.string.aed)} ",
            style = AppTheme.typography.robotoNormalTextFont16
        )

        Spacer(modifier = Modifier.height(AppTheme.dimensions.dimen20))

    }

}
