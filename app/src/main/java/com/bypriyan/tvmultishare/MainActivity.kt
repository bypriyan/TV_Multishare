package com.bypriyan.tvmultishare
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.bypriyan.tvmultishare.MainUi.HomeScreenUi
import com.bypriyan.tvmultishare.MainUi.ResponsiveFileSharingUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResponsiveFileSharingUI()
        }
    }
}

