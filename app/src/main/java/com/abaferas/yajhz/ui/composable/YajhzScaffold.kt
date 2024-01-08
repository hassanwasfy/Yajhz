package com.abaferas.yajhz.ui.composable

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.abaferas.yajhz.ui.theme.color_beige

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun YajhzScaffold(
    modifier: Modifier = Modifier,
    isLoading: Boolean,
    isError: Boolean,
    onLoading: @Composable () -> Unit = { YajhzLoading() },
    onError: @Composable () -> Unit = { YajhzError() },
    containerColor: Color = color_beige,
    topAppbar: @Composable () -> Unit = {},
    bottomAppbar: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    floatingActionButtonPosition: FabPosition = FabPosition.End,
    content: @Composable () -> Unit,
    ) {
    Scaffold(
        modifier = modifier,
        containerColor = containerColor,
        topBar = topAppbar,
        bottomBar = bottomAppbar,
        floatingActionButton = floatingActionButton,
        floatingActionButtonPosition = floatingActionButtonPosition,
    ) { _ ->
        AnimatedVisibility(visible = isLoading) {
            onLoading()
        }
        AnimatedVisibility(visible = isError) {
            onError()
        }
        AnimatedVisibility(visible = !isLoading && !isError) {
            content()
        }
    }
}
