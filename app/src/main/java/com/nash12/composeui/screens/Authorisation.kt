package com.nash12.composeui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Authorisation() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Box(
        modifier = Modifier
            .padding()
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(

            modifier = Modifier
                .width(240.dp)

        ) {
            OutlinedTextField(
                modifier = Modifier,
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") }
            )

            OutlinedTextField(
                modifier = Modifier,

                value = password,
                onValueChange = { password = it },
                label = { Text("Введите пароль") }
            )

            Button(
                onClick = {

                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Войти", fontSize = 16.sp)
            }
        }
    }
}






