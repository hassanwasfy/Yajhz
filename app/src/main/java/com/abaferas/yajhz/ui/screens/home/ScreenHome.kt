package com.abaferas.yajhz.ui.screens.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.yajhz.ui.navigation.NavigationHandler


@Composable
fun ScreenHome(
    screenHomeViewModel: ScreenHomeViewModel = hiltViewModel()
) {
    val state = screenHomeViewModel.state.collectAsState().value
    ScreenHomeContent(state = state, interaction = screenHomeViewModel)
    NavigationHandler(effects = screenHomeViewModel.effect) { effect, controller ->
        when (effect) {
            is HomeScreenUiEffect.NavigateUp -> {
                controller.popBackStack()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenHomeContent(
    state: HomeUiState,
    interaction: HomeScreenInteraction
) {

}


@Preview(device = "spec:width=360dp,height=800dp,orientation=portrait")
@Composable
fun HomeTester() {

}