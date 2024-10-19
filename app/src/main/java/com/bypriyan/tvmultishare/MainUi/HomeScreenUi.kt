package com.bypriyan.tvmultishare.MainUi


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bypriyan.tvmultishare.R

@Composable
fun HomeScreen() {
    val deviceType = getDeviceType()
    val context = LocalContext.current



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(responsiveBackgroundColor(deviceType))
            .padding(responsivePadding(deviceType))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            Text("Send files easily", fontSize = responsiveTextSize(deviceType))
        }

        Spacer(modifier = Modifier.height(responsiveSpacerSize(deviceType)))

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 220.dp),
            verticalArrangement = Arrangement.spacedBy(responsiveSpacerSize(deviceType)),
            horizontalArrangement = Arrangement.spacedBy(responsiveSpacerSize(deviceType)),
            modifier = Modifier.fillMaxSize()
        ) {
            item {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.height(responsiveSpacerSize(deviceType)))
                    Image(
                        painter = painterResource(id = R.drawable.send),
                        contentDescription = "Send Icon",
                        modifier = Modifier.size(responsiveImageSize(deviceType))
                    )
                    Spacer(modifier = Modifier.height(responsiveSpacerSize(deviceType)))
                    val buttonModifier = Modifier
                        .fillMaxWidth()
                        .height(responsiveButtonHeight(deviceType))
                    Button(
                        onClick = { /* Do something */ },
                        modifier = buttonModifier,
                        shape = responsiveButtonShape(deviceType)
                    ) {
                        Text(text = "Send", fontSize = responsiveTextSize(deviceType))
                    }
                }
            }
            item {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Spacer(modifier = Modifier.height(responsiveSpacerSize(deviceType)))
                    Image(
                        painter = painterResource(id = R.drawable.recive_file),
                        contentDescription = "Receive Icon",
                        modifier = Modifier.size(responsiveImageSize(deviceType))
                    )
                    Spacer(modifier = Modifier.height(responsiveSpacerSize(deviceType)))
                    val buttonModifier = Modifier
                        .fillMaxWidth()
                        .height(responsiveButtonHeight(deviceType))
                    Button(
                        onClick = { /* Do something */ },
                        modifier = buttonModifier,
                        shape = responsiveButtonShape(deviceType)
                    ) {
                        Text(text = "Receive", fontSize = responsiveTextSize(deviceType))
                    }
                }
            }
        }
    }
}
