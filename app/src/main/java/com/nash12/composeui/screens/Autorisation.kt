package com.nash12.composeui.screens

import android.text.Layout
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun autorisation() {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val button = "Войти"

    Box(
        modifier = Modifier
            .padding()
            .fillMaxSize()
    ) {

        OutlinedTextField(
            modifier = Modifier
                .align(Alignment.TopCenter),
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") }
        )

        OutlinedTextField(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(0.dp, 64.dp),
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Введите пароль") }

        )
        Button(
            onClick = {
                button
            },
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(0.dp, 128.dp),
        ) {
            Text(text = "Войти", fontSize = 16.sp, color = Color.White)
        }
    }
}






