package com.abaferas.yajhz.ui.screens.signup

interface SignUpScreenInteraction {
    fun onNameValueChange(newValue: String)
    fun onEmailChange(newValue: String)
    fun onPhoneChange(newValue: String)
    fun onPasswordChange(newValue: String)
    fun onPasswordConfirmChange(newValue: String)
    fun onClickSignUp()
    fun onClickLogIn()
}