package com.bilalqwatly.test.data.network

import com.bilalqwatly.test.R
import com.bilalqwatly.test.util.string.UiText
import java.net.ConnectException


object ErrorHandler {


    fun getErrorMessage(exception: Exception): UiText = if (exception is ConnectException)
        UiText.StringResource(R.string.please_check_your_internet_connection)
    else UiText.DynamicString(exception.toString())
}