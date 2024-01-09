package com.abaferas.yajhz.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.yajhz.R
import com.abaferas.yajhz.ui.composable.YajhzScaffold
import com.abaferas.yajhz.ui.navigation.NavigationHandler
import com.abaferas.yajhz.ui.screens.signup.navigateToSignUp
import com.abaferas.yajhz.ui.theme.color_beige
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenSplash(
    screenSplashViewModel: ScreenSplashViewModel = hiltViewModel()
) {
    YajhzScaffold(
        isLoading = false,
        isError = false
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.fillMaxSize(0.3f),
                painter = painterResource(id = R.drawable.brand_logo),
                contentDescription = ""
            )
        }
    }

    NavigationHandler(effects = screenSplashViewModel.effect) { effect, controller ->
        when (effect) {
            SplashScreenUiEffect.NaveToSignUp -> {
                //controller.navigateToSignUp()
            }
        }
    }
}
