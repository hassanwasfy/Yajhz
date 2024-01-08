package com.abaferas.yajhz.ui.screens.splash

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abaferas.yajhz.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenSplashViewModel @Inject constructor(): ViewModel() {

    private val iEffect = MutableSharedFlow<SplashScreenUiEffect>()
    val effect = iEffect.asSharedFlow()
    init {
        viewModelScope.launch(Dispatchers.IO) {
            delay(300)
            iEffect.emit(SplashScreenUiEffect.NaveToSignUp)
        }
    }
}