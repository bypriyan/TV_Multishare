package com.bypriyan.tvmultishare.utils

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.TextUnit

enum class DeviceType {
    PHONE, TABLET, TV
}

@Composable
fun getDeviceType(): DeviceType {
    val configuration = LocalConfiguration.current
    return when {
        configuration.screenWidthDp < 600 -> DeviceType.PHONE
        configuration.screenWidthDp < 1200 -> DeviceType.TABLET
        else -> DeviceType.TV
    }
}

@Composable
fun responsiveBackgroundColor(deviceType: DeviceType): Color {
    return when (deviceType) {
        DeviceType.PHONE -> Color.LightGray
        DeviceType.TABLET -> Color.Gray
        DeviceType.TV -> Color.DarkGray
    }
}

@Composable
fun responsivePadding(deviceType: DeviceType): PaddingValues {
    return when (deviceType) {
        DeviceType.PHONE -> PaddingValues(16.dp)
        DeviceType.TABLET -> PaddingValues(24.dp)
        DeviceType.TV -> PaddingValues(32.dp)
    }
}

@Composable
fun responsiveTextSize(deviceType: DeviceType): TextUnit {
    return when (deviceType) {
        DeviceType.PHONE -> 18.sp
        DeviceType.TABLET -> 24.sp
        DeviceType.TV -> 30.sp
    }
}

@Composable
fun responsiveSpacerSize(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE -> 16.dp
        DeviceType.TABLET -> 24.dp
        DeviceType.TV -> 32.dp
    }
}

@Composable
fun responsiveImageSize(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE -> 100.dp
        DeviceType.TABLET -> 150.dp
        DeviceType.TV -> 200.dp
    }
}

@Composable
fun responsiveButtonHeight(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE -> 48.dp
        DeviceType.TABLET -> 56.dp
        DeviceType.TV -> 64.dp
    }
}

@Composable
fun responsiveButtonShape(deviceType: DeviceType): RoundedCornerShape {
    return when (deviceType) {
        DeviceType.PHONE -> RoundedCornerShape(8.dp)
        DeviceType.TABLET -> RoundedCornerShape(12.dp)
        DeviceType.TV -> RoundedCornerShape(16.dp)
    }
}


