package com.nash12.composeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nash12.composeui.ui.theme.ComposeUITheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeUITheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { CenterAlignedTopAppBar(title = { Text("Инструменты.ru") }) }
                ) { innerPadding ->

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        WaterCounterScreen()
                    }
                }

            }
        }
    }

    @Composable
    fun WaterCounterScreen() {
        var amount by remember { mutableStateOf(0) }
        val goal = 2000

        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Вода за день")
            Text("$amount мл из $goal мл")

            Row {
                Button(onClick = {
                    if (amount >= 250) {
                        amount -= 250
                    } else {
                        amount = 0
                    }
                }) { Text("-250") }

                Spacer(modifier = Modifier.size(8.dp))

                Button(onClick = { amount += 250 }) { Text("+250") }
                Spacer(modifier = Modifier.size(8.dp))

                Button(onClick = { amount = 0 }) { Text("Сброс") }
            }

            if (amount >= goal) {
                Spacer(modifier = Modifier.size(16.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Цель достигнута!", fontSize = 32.sp)
                    Spacer(modifier = Modifier.size(8.dp))

                    Icon(
                        modifier = Modifier
                            .testTag("check_icon")
                            .size(64.dp),
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = Color(0xFFFF5722)
                    )
                }
            }
        }
    }
}