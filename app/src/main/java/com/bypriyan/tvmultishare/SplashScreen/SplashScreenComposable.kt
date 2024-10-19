package com.bypriyan.tvmultishare.SplashScreen
import com.bypriyan.tvmultishare.R

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.bypriyan.tvmultishare.ui.theme.home.HomeScreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreenContent() {
    var showMainScreen by remember { mutableStateOf(false) }

    // Launch effect to wait for the splash screen
    LaunchedEffect(key1 = true) {
        delay(3000L) // 3-second delay for the splash screen

        showMainScreen = true
    }

    if (showMainScreen) {
        MainContent()
        HomeScreen()
    } else {
        SplashScreen()
    }
}

@Composable
fun SplashScreen() {
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.splash))
    val progress by animateLottieCompositionAsState(
        composition = composition,
        iterations = LottieConstants.IterateForever,
        speed = 1.5f
    )

    Box(
        modifier = Modifier.fillMaxSize()
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition,
            progress = progress,
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Composable
fun MainContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}


