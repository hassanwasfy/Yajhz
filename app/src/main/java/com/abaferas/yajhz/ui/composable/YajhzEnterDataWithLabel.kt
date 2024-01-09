package com.abaferas.yajhz.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abaferas.yajhz.ui.modifiers.innerShadow
import com.abaferas.yajhz.ui.theme.Commons
import com.abaferas.yajhz.ui.theme.color_gray
import com.abaferas.yajhz.ui.theme.color_gray_light
import com.abaferas.yajhz.ui.theme.shadowBlack
import com.abaferas.yajhz.ui.theme.shadowWhite

@Composable
fun YajhzEnterDataWithLabel(
    label: String,
    value: String,
    placeHolder: String,
    onValueChange: (String) -> Unit
){
    Text(
        text = label,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp),
        fontFamily = Commons,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        color = color_gray,
    )
    Column(
        modifier = Modifier
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
        YajhzTextField(value, placeHolder, onValueChange)
    }
}