package com.abaferas.yajhz.ui.screens.login

sealed class LoginScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : LoginScreenUiEffect()
}