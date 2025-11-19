package com.nash12.composeui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun Example() {
    val tabs = (0..1).toList().map {
        Tab(Random.nextInt(), Random.nextBoolean())
    }
    Box(
        modifier = Modifier
    ) {
        LazyRow(
            modifier = Modifier
        ) {
            items(tabs) { model ->
                TabUi(model)
            }
        }
    }
}

data class Tab(val number: Int, val enabled: Boolean)

@Composable
fun TabUi(model: Tab) {
    Box(
        if (model.enabled) {
            Modifier.background(color = Color.Green)
        } else {
            Modifier.background(color = Color.White)
        }
    ) {
        Text(text = "${model.number}")
    }
}
