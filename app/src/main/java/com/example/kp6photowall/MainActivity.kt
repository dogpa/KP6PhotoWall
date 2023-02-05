package com.example.kp6photowall

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.kp6photowall.ui.theme.KP6PhotoWallTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KP6PhotoWallTheme {
                // A surface container using the 'background' color from the theme
                val photoList = PhotoViewModel().getPhotoList()
                Column {
                    IntroductionView()
                    LazyColumn() {
                        items(photoList) { photo ->
                            PhotoDetailView(photo = photo)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun IntroductionView() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "2022攝影集", fontSize = 40.sp


            )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KP6PhotoWallTheme {
        IntroductionView()
    }
}