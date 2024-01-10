package com.abaferas.yajhz.ui.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@Composable
fun <T> NavigationHandler(
    effects: Flow<T>,
    handleEffect: (T, NavController, Context) -> Unit
) {
    val navController = LocalNavController.current
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    LaunchedEffect(key1 = effects) {
        scope.launch {
            effects.collectLatest { effect ->
                handleEffect(effect, navController, context)
            }
        }
    }
}
