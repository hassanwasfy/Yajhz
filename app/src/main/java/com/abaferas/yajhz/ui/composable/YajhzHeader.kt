package com.abaferas.yajhz.ui.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abaferas.yajhz.ui.theme.Commons
import com.abaferas.yajhz.ui.theme.color_beige
import com.abaferas.yajhz.ui.theme.color_gray

@Composable
fun YajhzHeaderLabel(
    modifier: Modifier = Modifier,
    leftLabel: String, rightLabel: String, onclickViewAll: () -> Unit){
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        YajhzLabel(label = leftLabel)
        Text(
            text = rightLabel,
            modifier = Modifier.clickable { onclickViewAll() },
            fontFamily = Commons,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = color_beige,
            textDecoration = TextDecoration.Underline
        )
    }
}

@Composable
fun YajhzLabel(label: String){
    Text(
        text = label,
        fontFamily = Commons,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = color_gray,
    )
}