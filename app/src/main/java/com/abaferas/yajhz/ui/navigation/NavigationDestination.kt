package com.abaferas.yajhz.ui.navigation

sealed class NavigationDestination(val route: String) {
    data object ScreenSignUp: NavigationDestination("screen_signup")
    data object ScreenLogin: NavigationDestination("screen_login")
    data object ScreenHome: NavigationDestination("screen_home")
    data object ScreenSplash: NavigationDestination("screen_splash")
}