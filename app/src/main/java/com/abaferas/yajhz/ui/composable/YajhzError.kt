package com.abaferas.yajhz.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.abaferas.yajhz.R

@Composable
fun YajhzError(
    modifier: Modifier = Modifier,
){
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.error),
            contentDescription = ""
        )
    }
}