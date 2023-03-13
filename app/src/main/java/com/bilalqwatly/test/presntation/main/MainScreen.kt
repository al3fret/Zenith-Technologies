package com.bilalqwatly.test.presntation.main

import android.app.Activity
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.bilalqwatly.test.connectivity.ConnectivityObserver
import com.bilalqwatly.test.data.network.Response
import com.bilalqwatly.test.extension.toast
import com.bilalqwatly.test.presntation.base.screen.BaseScreen
import com.bilalqwatly.test.presntation.base.screen.ErrorPage
import com.bilalqwatly.test.presntation.base.screen.LoadingScreen
import com.bilalqwatly.test.presntation.main.content.MainScreenContent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun MainScreen() {

    val viewModel: MainViewModel = hiltViewModel()
    val context = LocalContext.current
    val productsState = viewModel.productsState.value
    val coroutineScope = rememberCoroutineScope()
    val networkStatus by viewModel.networkStatus.collectAsState()

    val activity = LocalContext.current as Activity






    ConstraintLayout {


        BaseScreen { modifier ->


            when (productsState) {
                is Response.Error -> ErrorPage(
                    modifier = modifier,
                    message = productsState.message.asString(context),
                    onClick = {

                        onReloadData(
                            viewModel = viewModel,
                            networkStatus = networkStatus,
                            coroutineScope = coroutineScope,
                            context = context
                        )

                    }
                )
                Response.Loading -> LoadingScreen()
                is Response.Success -> MainScreenContent(
                    modifier = modifier,
                    products = productsState.data!!,
                    onCloseClick = {
                        activity.finish()
                    }
                )
            }
        }
    }


}

fun onReloadData(
    viewModel: MainViewModel,
    networkStatus: ConnectivityObserver.Status,
    coroutineScope: CoroutineScope,
    context: Context
) {

    if (networkStatus == ConnectivityObserver.Status.AVAILABLE) {

        coroutineScope.launch {

            viewModel.getProductsFormApi()
        }

    } else {


        context.toast(com.bilalqwatly.test.R.string.please_check_your_internet_connection)

    }

}
