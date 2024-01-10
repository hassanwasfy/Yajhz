package com.abaferas.yajhz.ui.screens.login

interface LoginScreenInteraction {
    fun onEmailChange(newValue: String)
    fun onPasswordChange(newValue: String)
    fun onClickLogin()
    fun onCLickSignUp()


}