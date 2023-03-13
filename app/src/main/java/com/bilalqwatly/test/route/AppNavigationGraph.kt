package com.bilalqwatly.test.route

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.bilalqwatly.test.presntation.main.MainScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable


@ExperimentalMaterial3Api
@ExperimentalAnimationApi
@Composable
fun AppNavigationGraph(
    navHostController: NavHostController,
) {

    val startDes =  AppScreen.MainScreen.route


    AnimatedNavHost(navController = navHostController,
        startDestination = startDes,
        enterTransition = {
            slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(700))
        },
        exitTransition = {
            slideOutOfContainer(
                AnimatedContentScope.SlideDirection.Left,
                animationSpec = tween(700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                AnimatedContentScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentScope.SlideDirection.Right,
                animationSpec = tween(700)
            )
        }) {

        composable(AppScreen.MainScreen.route) {
            MainScreen()
        }

    }
}