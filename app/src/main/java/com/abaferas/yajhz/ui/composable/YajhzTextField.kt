package com.abaferas.yajhz.ui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.abaferas.yajhz.ui.theme.color_gray_light

@Composable
fun YajhzTextField(
    value: String,
    placeHolder: String,
    onValueChange: (String) -> Unit
){
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp),
        colors = TextFieldDefaults.colors(
            unfocusedPlaceholderColor = color_gray_light,
            focusedPlaceholderColor = color_gray_light,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),
        placeholder = { Text(text = placeHolder) }
    )
}