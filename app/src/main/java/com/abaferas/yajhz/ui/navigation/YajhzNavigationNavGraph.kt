package com.abaferas.yajhz.ui.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.abaferas.yajhz.ui.screens.home.addHomeRoute
import com.abaferas.yajhz.ui.screens.login.addLoginRoute
import com.abaferas.yajhz.ui.screens.signup.addSignUpRoute
import com.abaferas.yajhz.ui.screens.splash.addSplashRoute
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun YajhzNavigationNavGraph() {
    NavHost(
        navController = LocalNavController.current,
        startDestination = NavigationDestination.ScreenSplash.route,
        enterTransition = {
            fadeIn(
                tween(
                    300
                )
            )
        },
        exitTransition = {
            fadeOut(
                tween(
                    300
                )
            )
        }
    ) {
        addSplashRoute()
        addSignUpRoute()
        addLoginRoute()
        addHomeRoute()
    }
}