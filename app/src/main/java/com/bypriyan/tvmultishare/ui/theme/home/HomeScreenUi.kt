package com.bypriyan.tvmultishare.ui.theme.home


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bypriyan.tvmultishare.utils.getDeviceType
import com.bypriyan.tvmultishare.utils.responsiveBackgroundColor
import com.bypriyan.tvmultishare.utils.responsiveButtonHeight
import com.bypriyan.tvmultishare.utils.responsiveButtonShape
import com.bypriyan.tvmultishare.utils.responsiveImageSize
import com.bypriyan.tvmultishare.utils.responsivePadding
import com.bypriyan.tvmultishare.utils.responsiveSpacerSize
import com.bypriyan.tvmultishare.utils.responsiveTextSize
import com.bypriyan.tvmultishare.R

@Composable
fun HomeScreen() {

}

@Preview(showBackground = true)
@Composable
fun storageContent(title:String= "hello", storage:String = "hello"){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontSize = 14.sp,
            color = colorResource(R.color.dark_greay),
            fontFamily = FontFamily(
                Font(R.font.medium),
            )
        )

        Spacer(Modifier.height(10.dp))

        Text(
            text = storage,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontSize = 16.sp,
            color = colorResource(R.color.black),
            fontFamily = FontFamily(
                Font(R.font.black),
            )
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = "View Details",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontSize = 14.sp,
            color = colorResource(R.color.appColor),
            fontFamily = FontFamily(
                Font(R.font.bold),
            )
        )

    }
}
