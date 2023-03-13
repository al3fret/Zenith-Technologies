package com.bilalqwatly.test.route

import com.bilalqwatly.test.route.AppScreenName.MAIN_SCREEN

sealed class AppScreen(val route: String) {

    object MainScreen : AppScreen(MAIN_SCREEN)


}