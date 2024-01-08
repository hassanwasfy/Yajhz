package com.abaferas.yajhz.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.yajhz.ui.navigation.NavigationHandler
import com.abaferas.yajhz.ui.screens.signup.navigateToSignUp
import com.abaferas.yajhz.ui.theme.color_beige
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenSplash(
    screenSplashViewModel: ScreenSplashViewModel = hiltViewModel()
) {
    val sysUiColor = rememberSystemUiController()
    sysUiColor.setStatusBarColor(color = color_beige)
    sysUiColor.setNavigationBarColor(color = color_beige)

    Scaffold { _ ->
        Column(modifier = Modifier.fillMaxSize()) {

        }
    }

    NavigationHandler(effects = screenSplashViewModel.effect) { effect, controller ->
        when (effect) {
            SplashScreenUiEffect.NaveToSignUp -> {
                controller.navigateToSignUp()
            }
        }
    }
}
