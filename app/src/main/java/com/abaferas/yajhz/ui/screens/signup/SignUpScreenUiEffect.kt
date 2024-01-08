package com.abaferas.yajhz.ui.screens.signup

sealed class SignUpScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : SignUpScreenUiEffect()
}