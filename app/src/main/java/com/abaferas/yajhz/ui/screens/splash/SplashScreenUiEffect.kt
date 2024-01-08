package com.abaferas.yajhz.ui.screens.splash

import com.abaferas.yajhz.ui.base.BaseUiEffect

sealed class SplashScreenUiEffect() : BaseUiEffect {
    data object NaveToSignUp : SplashScreenUiEffect()
}