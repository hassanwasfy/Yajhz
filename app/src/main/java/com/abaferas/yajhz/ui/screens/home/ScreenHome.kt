package com.abaferas.yajhz.ui.screens.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.abaferas.yajhz.R
import com.abaferas.yajhz.ui.composable.YajhzHeaderLabel
import com.abaferas.yajhz.ui.composable.YajhzScaffold
import com.abaferas.yajhz.ui.composable.YajhzTextField
import com.abaferas.yajhz.ui.modifiers.innerShadow
import com.abaferas.yajhz.ui.navigation.NavigationHandler
import com.abaferas.yajhz.ui.theme.Commons
import com.abaferas.yajhz.ui.theme.color_beige
import com.abaferas.yajhz.ui.theme.color_gray
import com.abaferas.yajhz.ui.theme.color_gray_half
import com.abaferas.yajhz.ui.theme.shadowBlack
import com.abaferas.yajhz.ui.theme.shadowWhite

@Composable
fun ScreenHome(
    screenHomeViewModel: ScreenHomeViewModel = hiltViewModel()
) {
    val state = screenHomeViewModel.state.collectAsState().value
    ScreenHomeContent(state = state, interaction = screenHomeViewModel)
    NavigationHandler(effects = screenHomeViewModel.effect) { effect, _, context ->
        when (effect) {
            is HomeScreenUiEffect.NavigateUp -> {
                Toast.makeText(context,"No place to-go!",Toast.LENGTH_SHORT).show()
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
        isError = state.error.isError,
        topAppbar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        modifier = Modifier,
                        fontFamily = Commons,
                        fontWeight = FontWeight.Medium,
                        fontSize = 24.sp,
                        color = color_gray,
                        text = "Home"
                    )
                },
                navigationIcon = {
                    Icon(
                        modifier = Modifier
                            .size(24.dp)
                            .padding(start = 8.dp)
                            .clickable { interaction.onClickBack() },
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "",
                        tint = color_beige
                    )
                },
                actions = {
                    Icon(
                        modifier = Modifier
                            .size(32.dp)
                            .padding(end = 8.dp),
                        painter = painterResource(id = R.drawable.cart_icon),
                        contentDescription = "",
                        tint = color_beige
                    )
                    Icon(
                        modifier = Modifier
                            .size(32.dp)
                            .padding(end = 8.dp),
                        painter = painterResource(id = R.drawable.menu_icon),
                        contentDescription = "",
                        tint = color_beige
                    )
                }
            )
        }
    ) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 64.dp)
        ) {
            item {
                Text(
                    modifier = Modifier.padding(start = 24.dp),
                    fontFamily = Commons,
                    fontWeight = FontWeight.Medium,
                    fontSize = 32.sp,
                    color = color_gray,
                    text = "Hello ${state.name}"
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        modifier = Modifier
                            .padding(start = 24.dp)
                            .padding(end = 12.dp),
                        fontFamily = Commons,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp,
                        color = color_gray,
                        text = state.address
                    )
                    Icon(
                        modifier = Modifier
                            .size(18.dp)
                            .rotate(180f),
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "",
                        tint = color_beige
                    )
                }
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.7f)
                            .padding(top = 4.dp, bottom = 8.dp)
                            .innerShadow(
                                shape = RoundedCornerShape(CornerSize(12.dp)),
                                color = shadowWhite,
                                offsetY = (0).dp,
                                offsetX = (0).dp
                            )
                            .innerShadow(
                                shape = RoundedCornerShape(CornerSize(12.dp)),
                                color = shadowBlack,
                                offsetY = 2.dp,
                                offsetX = 2.dp
                            ),

                        ) {
                        YajhzTextField("", "Search for fave food", interaction::onSearchValueChange)
                    }
                    Card(modifier = Modifier,
                        colors = CardDefaults.cardColors(containerColor = color_beige)){
                        Icon(
                            modifier = Modifier.padding(16.dp), tint = Color.White,
                            painter = painterResource(id = R.drawable.search_icon), contentDescription = "")
                    }
                    Icon(tint = color_beige,
                        modifier = Modifier,
                        painter = painterResource(id = R.drawable.fliter_icon), contentDescription = "")
                }
            }
            item {

                YajhzHeaderLabel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    leftLabel = "Categories.", rightLabel = "View all") {

                }
                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ){
                    items(state.categoriesList.data){
                        Card(
                            modifier = Modifier
                                .width(140.dp)
                                .height(112.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                YajhzImageLoader(
                                    modifier = Modifier
                                        .size(90.dp)
                                        .align(Alignment.End)
                                        .padding(top = 4.dp),
                                    imageLink = it.image)
                                Text(
                                    text = it.name,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 16.dp, bottom = 8.dp),
                                    fontFamily = Commons,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.sp,
                                    color = color_gray,
                                )
                            }
                        }
                    }
                }
            }
            item {
                YajhzHeaderLabel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(top = 24.dp),
                    leftLabel = "Populars.", rightLabel = "View all") {

                }

                LazyRow(
                    modifier = Modifier.padding(top = 8.dp, bottom = 24.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ){
                    items(state.popularList.data){
                        Card(
                            modifier = Modifier
                                .width(186.dp)
                                .height(164.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize()
                            ) {
                                YajhzImageLoader(imageLink = it.image)
                                Column(
                                    modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.SpaceBetween,
                                    horizontalAlignment = Alignment.Start
                                ) {
                                    Icon(
                                        modifier = Modifier.padding(16.dp),
                                        painter = painterResource(id = R.drawable.hear_selected),
                                        contentDescription = "",
                                        tint = color_beige
                                    )
                                    Column(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .fillMaxHeight(0.7f)
                                            .background(color_gray_half)
                                            .padding(horizontal = 12.dp, vertical = 4.dp),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.Start
                                    ) {
                                        Text(
                                            modifier = Modifier
                                                .padding(end = 12.dp),
                                            fontFamily = Commons,
                                            fontWeight = FontWeight.Medium,
                                            fontSize = 18.sp,
                                            color = color_beige,
                                            text = it.name
                                        )
                                        Row(modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.Start,
                                            verticalAlignment = Alignment.CenterVertically,

                                        ) {
                                            Icon(
                                                modifier = Modifier.size(12.dp),
                                                painter = painterResource(id = R.drawable.icon_location),
                                                contentDescription = "", tint = color_beige,
                                            )
                                            Text(
                                                modifier = Modifier.padding(start = 4.dp),
                                                fontFamily = Commons,
                                                fontWeight = FontWeight.Medium,
                                                fontSize = 18.sp,
                                                color = color_beige,
                                                text = "${it.distance}"
                                            )
                                        }
                                        Row(modifier = Modifier.fillMaxWidth(),
                                            horizontalArrangement = Arrangement.Start,
                                            verticalAlignment = Alignment.CenterVertically,

                                            ) {
                                            LazyRow(
                                                modifier = Modifier.fillMaxWidth(0.6f)
                                            ){
                                                items(5){
                                                    Icon(
                                                        modifier = Modifier.size(16.dp),
                                                        painter = painterResource(id = R.drawable.icon_star),
                                                        contentDescription = "", tint = color_beige,
                                                    )
                                                }
                                            }
                                            Text(
                                                modifier = Modifier
                                                    .padding(end = 12.dp),
                                                fontFamily = Commons,
                                                fontWeight = FontWeight.Medium,
                                                fontSize = 18.sp,
                                                color = color_beige,
                                                text = it.rate
                                            )
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            item {

                YajhzHeaderLabel(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    leftLabel = "Trending Now.", rightLabel = "View all") {

                }
                LazyRow(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ){
                    items(state.trendingList.data){
                        Card(
                            modifier = Modifier
                                .width(140.dp)
                                .height(112.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                YajhzImageLoader(imageLink = it.image)
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


@Composable
fun YajhzImageLoader(
    modifier: Modifier = Modifier,
    verticalArrangement:Arrangement.Vertical = Arrangement.Center,
    horizontalAlignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    imageLink: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment
    ){
        rememberAsyncImagePainter(
        model = imageLink, placeholder = painterResource(
            id = R.drawable.food_background
        )
    )
}
}