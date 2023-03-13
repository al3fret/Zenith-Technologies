package com.bilalqwatly.test.extension

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes


fun Context.toast(message: String?) {

    if (message != null)
        if (message.isNotEmpty() && message.isNotBlank())
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.toast(@StringRes resId: Int) {
    Toast.makeText(this, this.getText(resId), Toast.LENGTH_LONG).show()
}
