package com.abaferas.yajhz.ui.screens.login

import androidx.lifecycle.SavedStateHandle
import com.abaferas.yajhz.data.models.auth.LoginBody
import com.abaferas.yajhz.data.models.auth.SignUpBody
import com.abaferas.yajhz.data.repository.IRepository
import com.abaferas.yajhz.domain.models.Auth
import com.abaferas.yajhz.ui.base.BaseViewModel
import com.abaferas.yajhz.ui.screens.signup.SignUpScreenUiEffect
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ScreenLoginViewModel @Inject constructor(
    private val iRepository: IRepository
) : BaseViewModel<LoginUiState, LoginScreenUiEffect>(LoginUiState()), LoginScreenInteraction {

    init {
        getData()
    }

    override fun getData() {
        iState.update {
            it.copy(
                isLoading = false
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

    override fun onPasswordChange(newValue: String) {
        iState.update {
            it.copy(
                password = newValue
            )
        }
    }

    override fun onClickLogin() {
        iState.update {
            it.copy(
                isLogging = true
            )
        }
        val loginBody = LoginBody(
            email  = iState.value.email,
            password  = iState.value.password,
            deviceToken = ""
        )
        tryToExecute(
            execute = {iRepository.userLogin(loginBody)},
            onError = ::onError,
            onSuccess = ::onSuccess
        )
    }

    private fun onSuccess(result: Auth){
        sendUiEffect(LoginScreenUiEffect.Login)
    }
    private fun onError(msg: String){
        iState.update {
            it.copy(
                isLogging = false
            )
        }
    }

    override fun onCLickSignUp() {
        sendUiEffect(LoginScreenUiEffect.SignUp)
    }
}