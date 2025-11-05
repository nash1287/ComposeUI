package com.nash12.composeui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun RandomizerScreen() {
    var randomeNumber by remember { mutableStateOf(0) }
    Box(
        modifier = Modifier
            .padding()
            .fillMaxSize()
    ) {
        Text(
            "$randomeNumber",
            fontSize = 32.sp,
            modifier = Modifier.align(Alignment.Center)
        )

        Button(
            onClick = {
                randomeNumber = Random.nextInt(20, 50)
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 80.dp)
        ) {
            Text(text = "Generate number", fontSize = 24.sp)
        }
        Button(
            onClick = {
                randomeNumber = 0
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text(text = "Сброс", fontSize = 24.sp)
        }
    }
}