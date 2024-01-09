package com.abaferas.yajhz.ui.navigation

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.abaferas.yajhz.ui.screens.home.addHomeRoute
import com.abaferas.yajhz.ui.screens.login.addLoginRoute
import com.abaferas.yajhz.ui.screens.signup.addSignUpRoute
import com.abaferas.yajhz.ui.screens.splash.addSplashRoute
import com.abaferas.yajhz.ui.theme.color_beige
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun YajhzNavigationNavGraph() {
    val sysUiColor = rememberSystemUiController()
    sysUiColor.setStatusBarColor(color = color_beige)
    sysUiColor.setNavigationBarColor(color = color_beige)
    NavHost(
        navController = LocalNavController.current,
        startDestination = NavigationDestination.ScreenSplash.route,
        enterTransition = {
            scaleIn(
                tween(
                    300
                )
            )
        },
        exitTransition = {
            scaleOut(
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