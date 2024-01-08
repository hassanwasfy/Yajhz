package com.abaferas.yajhz.ui.screens.splash

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.yajhz.ui.navigation.NavigationDestination
import com.google.accompanist.systemuicontroller.rememberSystemUiController

fun NavGraphBuilder.addSplashRoute() {
    composable(
        route = NavigationDestination.ScreenSplash.route,
    ) {
        ScreenSplash()
    }
}

fun NavController.navigateToSplash() {
    navigate(NavigationDestination.ScreenSplash.route)
}