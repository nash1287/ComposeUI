package com.nash12.composeui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun LazyListOfCards() {
    val list = (0..100000).toList()
    LazyColumn{
        items(list) {
            Text(text = "$it", fontSize = 36.sp)
        }

    }




}