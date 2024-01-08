package com.abaferas.yajhz.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.abaferas.yajhz.ui.screens.home.addHomeRoute
import com.abaferas.yajhz.ui.screens.login.addLoginRoute
import com.abaferas.yajhz.ui.screens.signup.addSignUpRoute


@Composable
fun YajhzNavigationNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = NavigationDestination.ScreenSignUp.route
    ) {
        addSignUpRoute()
        addLoginRoute()
        addHomeRoute()
    }
}