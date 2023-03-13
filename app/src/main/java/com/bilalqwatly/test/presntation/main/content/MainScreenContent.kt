package com.bilalqwatly.test.presntation.main.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.bilalqwatly.test.domin.entites.Product
import com.bilalqwatly.test.ui.theme.AppTheme


@Composable
fun MainScreenContent(modifier: Modifier, products: List<Product>, onCloseClick: () -> Unit) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(AppTheme.dimensions.dimen10))

        ProductsAppBar(onCloseClick = onCloseClick)
        Spacer(modifier = Modifier.height(AppTheme.dimensions.dimen10))

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),

            ) {
            items(products.size) {

                ProductListItem(product = products[it])


            }
        }
    }
}