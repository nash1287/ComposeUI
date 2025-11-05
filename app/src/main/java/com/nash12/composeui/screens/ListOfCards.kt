package com.nash12.composeui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ListOfCards() {
    for(i in 0..100) {
        Text(text = "$i", fontSize = 36.sp)
    }
}