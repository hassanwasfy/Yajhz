package com.abaferas.yajhz.ui.screens.home

import com.abaferas.yajhz.ui.base.BaseUiEffect

sealed class HomeScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : HomeScreenUiEffect()
}