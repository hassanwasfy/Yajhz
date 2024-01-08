package com.abaferas.yajhz.ui.screens.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.abaferas.yajhz.ui.navigation.NavigationDestination

fun NavGraphBuilder.addSignUpRoute() {
    composable(
        route = NavigationDestination.ScreenSignUp.route,
    ) {
        ScreenSignUp()
    }
}

fun NavController.navigateToSignUp() {
    navigate(NavigationDestination.ScreenSignUp.route)
}