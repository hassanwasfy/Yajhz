package com.abaferas.yajhz.ui.screens.signup

import androidx.lifecycle.SavedStateHandle
import com.abaferas.yajhz.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ScreenSignUpViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    /*TODO Add you use cases*/
) : BaseViewModel<SignUpUiState, SignUpScreenUiEffect>(SignUpUiState()), SignUpScreenInteraction {


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