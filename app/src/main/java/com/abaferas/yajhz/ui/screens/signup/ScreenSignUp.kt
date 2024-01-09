package com.abaferas.yajhz.ui.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.abaferas.yajhz.R
import com.abaferas.yajhz.ui.composable.YajhzEnterDataWithLabel
import com.abaferas.yajhz.ui.composable.YajhzScaffold
import com.abaferas.yajhz.ui.modifiers.innerShadow
import com.abaferas.yajhz.ui.navigation.NavigationHandler
import com.abaferas.yajhz.ui.theme.Commons
import com.abaferas.yajhz.ui.theme.color_beige
import com.abaferas.yajhz.ui.theme.color_gray
import com.abaferas.yajhz.ui.theme.color_gray_light
import com.abaferas.yajhz.ui.theme.color_green
import com.abaferas.yajhz.ui.theme.linear_beige
import com.abaferas.yajhz.ui.theme.linear_brush
import com.abaferas.yajhz.ui.theme.shadowBlack
import com.abaferas.yajhz.ui.theme.shadowWhite


@Composable
fun ScreenSignUp(
    screenSignUpViewModel: ScreenSignUpViewModel = hiltViewModel()
) {
    val state = screenSignUpViewModel.state.collectAsState().value
    ScreenSignUpContent(state = state, interaction = screenSignUpViewModel)
    NavigationHandler(effects = screenSignUpViewModel.effect) { effect, controller ->
        when (effect) {
            is SignUpScreenUiEffect.NavigateUp -> {
                controller.popBackStack()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenSignUpContent(
    state: SignUpUiState,
    interaction: SignUpScreenInteraction
) {
    YajhzScaffold(
        isLoading = state.isLoading,
        isError = state.error.isError
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.food_background),
                contentDescription = ""
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(brush = linear_brush, alpha = 0.30f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth(0.30f)
                        .weight(0.8f),
                    painter = painterResource(id = R.drawable.brand_logo),
                    contentDescription = ""
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.85f)
                ) {
                    Card(
                        modifier = Modifier.fillMaxSize(),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                    ) {

                    }
                    Column(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Card(
                            colors = CardDefaults.cardColors(containerColor = Color.White),
                            shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 24.dp)
                        ) {
                            Text(
                                text = "SIGN UP",
                                modifier = Modifier.padding(vertical = 20.dp, horizontal = 40.dp),
                                fontFamily = Commons,
                                fontWeight = FontWeight.Bold,
                                fontSize = 24.sp,
                                color = color_gray
                            )
                        }
                        Column(
                            modifier = Modifier.padding(horizontal = 16.dp)
                        ) {
                            YajhzEnterDataWithLabel(
                                label = "Name.",
                                value = "",
                                placeHolder = "Write 14 character",
                                onValueChange = {}
                            )
                            YajhzEnterDataWithLabel(
                                label = "Email.",
                                value = "",
                                placeHolder = "write your email",
                                onValueChange = {}
                            )
                            YajhzEnterDataWithLabel(
                                label = "Phone Number.",
                                value = "",
                                placeHolder = "Write 11 numbers",
                                onValueChange = {}
                            )
                            YajhzEnterDataWithLabel(
                                label = "Password.",
                                value = "",
                                placeHolder = "Write 8 character at least",
                                onValueChange = {}
                            )
                            YajhzEnterDataWithLabel(
                                label = "Confirm Password.",
                                value = "",
                                placeHolder = "Write your password again",
                                onValueChange = {}
                            )
                            Button(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .fillMaxWidth(0.75f)
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 36.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = color_green,
                                    contentColor = Color.White
                                ),
                                shape = RoundedCornerShape(CornerSize(12.dp))
                            ) {
                                Text(
                                    text = "Sign up",
                                    modifier = Modifier.padding(
                                        vertical = 8.dp,
                                    ),
                                    fontFamily = Commons,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 24.sp,
                                )
                            }
                            Row(
                                modifier = Modifier.fillMaxWidth().padding(top = 24.dp),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "have an account ?",
                                    modifier = Modifier,
                                    fontFamily = Commons,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 10.sp,
                                )
                                Text(
                                    text = "Login",
                                    modifier = Modifier.padding(start = 8.dp),
                                    fontFamily = Commons,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 10.sp,
                                    color = color_beige
                                )
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
fun SignUpTester() {
    ScreenSignUp()
}