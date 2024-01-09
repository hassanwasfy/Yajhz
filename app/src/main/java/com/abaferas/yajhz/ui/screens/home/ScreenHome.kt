package com.abaferas.yajhz.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.yajhz.R
import com.abaferas.yajhz.ui.composable.YajhzScaffold
import com.abaferas.yajhz.ui.composable.YajhzTextField
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
    YajhzScaffold(
        isLoading = state.isLoading,
        isError = state.error.isError
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Text(text = "Hello Ahmed")
                Text(text = "Hello Ahmed")
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    YajhzTextField(value = "", placeHolder = "Search for fav food", onValueChange = {})
                    Box(modifier = Modifier){
                        Icon(painter = painterResource(id = R.drawable.search_icon), contentDescription = "")
                    }
                    Icon(painter = painterResource(id = R.drawable.fliter_icon), contentDescription = "")
                }
            }
            item {
                Text(text = "Categories.")
                LazyRow{
                    items(4){
                        Card {
                            Column {
                                Image(painter = painterResource(id = R.drawable.food_background), contentDescription = "")
                                Text(text = "Hello Ahmed")
                            }
                        }
                    }
                }
            }
            item {
                Text(text = "Popular Now.")
                LazyRow{
                    items(4){
                        Card {
                            Column {
                                Image(painter = painterResource(id = R.drawable.food_background), contentDescription = "")
                                Text(text = "Hello Ahmed")
                            }
                        }
                    }
                }
            }
            item {
                Text(text = "Trending Now.")
                LazyRow{
                    items(4){
                        Card {
                            Column {
                                Image(painter = painterResource(id = R.drawable.food_background), contentDescription = "")
                                Text(text = "Hello Ahmed")
                            }
                        }
                    }
                }
            }
        }
    }
}


@Preview(device = "spec:width=360dp,height=800dp,orientation=portrait")
@Composable
fun HomeTester() {

}