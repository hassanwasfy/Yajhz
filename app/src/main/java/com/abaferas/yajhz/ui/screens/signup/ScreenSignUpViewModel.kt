package com.abaferas.yajhz.ui.screens.signup

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.abaferas.yajhz.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
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
        viewModelScope.launch {
            delay(400)
            iState.update {
                it.copy(isLoading = false)
            }
        }
    }

    override fun onClickBack() {
        
    }
}