package com.abaferas.yajhz.ui.screens.login

import androidx.lifecycle.SavedStateHandle
import com.abaferas.yajhz.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ScreenLoginViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    /*TODO Add you use cases*/
) : BaseViewModel<LoginUiState, LoginScreenUiEffect>(LoginUiState()), LoginScreenInteraction {

    init {
        getData()
    }

    override fun getData() {
        TODO("Not yet implemented")
    }

    override fun onClickBack() {
        TODO("Not yet implemented")
    }
}