package com.nash12.composeui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun LazyListOfCards() {
    val email by remember { mutableStateOf("") }
    val list = (0..1000).toList().map { Random.nextInt() }
    Box(modifier = Modifier)
    LazyColumn(
        contentPadding = PaddingValues(8.dp)
    ) {
        itemsIndexed(list) { index, value ->
            Card(
                modifier = Modifier
                    .testTag("card_$index")
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Text(
                    text = "$value",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

