package com.abaferas.yajhz.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.abaferas.yajhz.ui.theme.color_black

@Composable
fun YajhzLoading(
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier) {
        CircularProgressIndicator(
            color = color_black
        )
    }
}