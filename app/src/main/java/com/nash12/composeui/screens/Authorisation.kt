package com.nash12.composeui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Authorisation() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var showCheckIcon by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding()
            .fillMaxSize(),
        contentAlignment = Alignment.Center

    ) {
        Column(
            modifier = Modifier.width(240.dp),
            horizontalAlignment = Alignment.CenterHorizontally
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
                    val validEmail = "123"
                    val validPassword = "123"
                    if (email == validEmail && password == validPassword) {
                        showCheckIcon = true
                    } else {
                        showCheckIcon = false
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Войти", fontSize = 16.sp)
            }
        }
        if (showCheckIcon) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
            Spacer(modifier = Modifier.size(260.dp))
            Icon(
                modifier = Modifier
                    .testTag("check_icon")
                    .size(64.dp),
                imageVector = Icons.Default.Check,
                contentDescription = null,
                tint = Color(0xFF4CAF50)
            )
        }
            }
    }
}






