package com.multishare.composable

import android.icu.text.ListFormatter.Width
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.VectorProperty
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun circularProgressIndicator(
    percent:Float,
    num:Int,
    fontSize: TextUnit = 24.sp,
    radius:Dp = 50.dp,
    color: Color ,
    strokeWidth: Dp = 8.dp,
    animationDuration:Int = 2000,
    animDelay:Int = 0
){

    var animationPlayed by remember {
        mutableStateOf(false)
    }

    val curPercentage = animateFloatAsState(
        targetValue = if(animationPlayed) percent else 0f,
        animationSpec = tween(
            durationMillis =  animationDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(key1 = true){
        animationPlayed = true
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier =  Modifier.size(radius*2f)
    ){

        androidx.compose.foundation.Canvas(modifier = Modifier.size(radius*2f)) {
            drawArc(
                color = color,
                -90f,
                360 * curPercentage.value,
                useCenter =  false,
                style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
            )
        }

        Text(
            text = "${(curPercentage.value * num).toInt().toString()}%",
            color =  Color.Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    }

}