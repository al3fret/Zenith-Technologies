package com.bilalqwatly.test.data.network

import com.bilalqwatly.test.util.string.UiText

sealed class Response<out T> {

    object Loading : Response<Nothing>()
    data class Success<out T>(val data: T?) : Response<T>()
    data class Error(var message: UiText) : Response<Nothing>()
}
