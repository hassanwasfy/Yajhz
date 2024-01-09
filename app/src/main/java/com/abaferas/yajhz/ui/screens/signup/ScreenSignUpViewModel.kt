package com.abaferas.yajhz.ui.screens.signup

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.repository.IRepository
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.ui.base.BaseViewModel
import com.abaferas.yajhz.ui.base.ErrorUiState
import com.abaferas.yajhz.ui.mappers.toUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ScreenSignUpViewModel @Inject constructor(
    private val iRepository: IRepository
) : BaseViewModel<SignUpUiState, SignUpScreenUiEffect>(SignUpUiState()), SignUpScreenInteraction {


    init {
        getData()
    }

    override fun getData() {
        iState.update {
            it.copy(
                isLoading = false,
                error = ErrorUiState(),
            )
        }
    }

    override fun onNameValueChange(newValue: String) {
        iState.update {
            it.copy(
                name = newValue
            )
        }
    }

    override fun onEmailChange(newValue: String) {
        iState.update {
            it.copy(
                email = newValue
            )
        }
    }

    override fun onPhoneChange(newValue: String) {
        iState.update {
            it.copy(
                phoneNumber = newValue
            )
        }
    }

    override fun onPasswordChange(newValue: String) {
        iState.update {
            it.copy(
                password = newValue
            )
        }
    }

    override fun onPasswordConfirmChange(newValue: String) {
        iState.update {
            it.copy(
                confirmPassword = newValue
            )
        }
    }

    override fun onClickSignUp() {
        iState.update {
            it.copy(
                isLogging = true
            )
        }
        val signUpBody = SignUpBody(
            name = iState.value.name,
            email  = iState.value.email,
            password  = iState.value.password,
            phone  = iState.value.phoneNumber,
            deviceToken  = "",
        )
        tryToExecute(
            execute = {iRepository.userSignUp(signUpBody)},
            onError = ::onError,
            onSuccess = ::onSuccess
        )
    }

    private fun onSuccess(result: Auth){
        sendUiEffect(SignUpScreenUiEffect.SignUp)
    }
    private fun onError(msg: String){
        iState.update {
            it.copy(
                isLogging = false
            )
        }
    }

    override fun onClickLogIn() {
        sendUiEffect(SignUpScreenUiEffect.Login)
    }
}