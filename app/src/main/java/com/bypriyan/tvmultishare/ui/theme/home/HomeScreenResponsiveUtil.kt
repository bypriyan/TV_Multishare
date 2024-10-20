package com.bypriyan.tvmultishare.ui.theme.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.TextUnit

// Enum to identify the device type with more granular phone sizes
enum class DeviceType {
    PHONE_SMALL, PHONE_MEDIUM, PHONE_LARGE, PHONE_XLARGE, TABLET, TV
}

// Function to determine the device type by screen width, with finer distinctions for phones
@Composable
fun getDeviceType(): DeviceType {
    val configuration = LocalConfiguration.current
    return when {
        configuration.screenWidthDp < 360 -> DeviceType.PHONE_SMALL
        configuration.screenWidthDp in 360..399 -> DeviceType.PHONE_MEDIUM
        configuration.screenWidthDp in 400..479 -> DeviceType.PHONE_LARGE
        configuration.screenWidthDp in 480..599 -> DeviceType.PHONE_XLARGE
        configuration.screenWidthDp in 600..1199 -> DeviceType.TABLET
        else -> DeviceType.TV
    }
}

// Function to provide a responsive background color based on device type
@Composable
fun responsiveBackgroundColor(deviceType: DeviceType): Color {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> Color.LightGray
        DeviceType.PHONE_MEDIUM -> Color.LightGray
        DeviceType.PHONE_LARGE -> Color.Gray
        DeviceType.PHONE_XLARGE -> Color.Gray
        DeviceType.TABLET -> Color.DarkGray
        DeviceType.TV -> Color.Black
    }
}

@Composable
fun responsivePadding(deviceType: DeviceType): PaddingValues {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> PaddingValues(8.dp)
        DeviceType.PHONE_MEDIUM -> PaddingValues(12.dp)
        DeviceType.PHONE_LARGE -> PaddingValues(16.dp)
        DeviceType.PHONE_XLARGE -> PaddingValues(20.dp)
        DeviceType.TABLET -> PaddingValues(24.dp)
        DeviceType.TV -> PaddingValues(32.dp)
    }
}

@Composable
fun responsiveTextSize(deviceType: DeviceType): TextUnit {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> 14.sp
        DeviceType.PHONE_MEDIUM -> 16.sp
        DeviceType.PHONE_LARGE -> 18.sp
        DeviceType.PHONE_XLARGE -> 20.sp
        DeviceType.TABLET -> 24.sp
        DeviceType.TV -> 30.sp
    }
}

@Composable
fun responsiveSpacerSize(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> 8.dp
        DeviceType.PHONE_MEDIUM -> 12.dp
        DeviceType.PHONE_LARGE -> 16.dp
        DeviceType.PHONE_XLARGE -> 20.dp
        DeviceType.TABLET -> 24.dp
        DeviceType.TV -> 32.dp
    }
}

@Composable
fun responsiveImageSize(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> 80.dp
        DeviceType.PHONE_MEDIUM -> 100.dp
        DeviceType.PHONE_LARGE -> 120.dp
        DeviceType.PHONE_XLARGE -> 140.dp
        DeviceType.TABLET -> 150.dp
        DeviceType.TV -> 200.dp
    }
}

@Composable
fun responsiveButtonHeight(deviceType: DeviceType): Dp {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> 40.dp
        DeviceType.PHONE_MEDIUM -> 44.dp
        DeviceType.PHONE_LARGE -> 48.dp
        DeviceType.PHONE_XLARGE -> 52.dp
        DeviceType.TABLET -> 56.dp
        DeviceType.TV -> 64.dp
    }
}

@Composable
fun responsiveButtonShape(deviceType: DeviceType): RoundedCornerShape {
    return when (deviceType) {
        DeviceType.PHONE_SMALL -> RoundedCornerShape(4.dp)
        DeviceType.PHONE_MEDIUM -> RoundedCornerShape(6.dp)
        DeviceType.PHONE_LARGE -> RoundedCornerShape(8.dp)
        DeviceType.PHONE_XLARGE -> RoundedCornerShape(10.dp)
        DeviceType.TABLET -> RoundedCornerShape(12.dp)
        DeviceType.TV -> RoundedCornerShape(16.dp)
    }
}
