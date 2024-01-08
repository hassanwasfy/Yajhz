package com.abaferas.yajhz.ui.screens.signup

import com.abaferas.yajhz.ui.base.BaseUiEffect

sealed class SignUpScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : SignUpScreenUiEffect()
}