package com.abaferas.yajhz.ui.screens.home

sealed class HomeScreenUiEffect() : BaseUiEffect {
    data object NavigateUp : HomeScreenUiEffect()
}