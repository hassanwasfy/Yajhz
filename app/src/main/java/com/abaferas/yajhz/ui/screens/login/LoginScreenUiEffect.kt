package com.abaferas.yajhz.ui.screens.login

import com.abaferas.yajhz.ui.base.BaseUiEffect

sealed class LoginScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : LoginScreenUiEffect()
}