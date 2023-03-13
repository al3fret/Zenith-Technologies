package com.bilalqwatly.test.presntation.main

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bilalqwatly.test.connectivity.ConnectivityObserver
import com.bilalqwatly.test.data.network.Response
import com.bilalqwatly.test.domin.entites.Product
import com.bilalqwatly.test.domin.repositories.api.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    connectivityObserver: ConnectivityObserver,
    private val apiRepository: ApiRepository,
) : ViewModel() {

    private var _productsState =
        mutableStateOf<Response<List<Product>>>(
            Response.Loading
        )
    val productsState: State<Response<List<Product>>> = _productsState


    val networkStatus = connectivityObserver.observe().stateIn(
        scope = viewModelScope,
        initialValue = ConnectivityObserver.Status.UNAVAILABLE,
        started = SharingStarted.Eagerly
    )


    init {
        getProductsFormApi()
    }

     fun getProductsFormApi(
    ) {

        viewModelScope.launch {
            apiRepository.getWorkOrders().collect {
                _productsState.value = it
            }
        }
    }


}
