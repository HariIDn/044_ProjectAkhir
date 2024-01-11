package com.example.a044_projectakhir.ui.halaman

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Authpage(
    // ...
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xF8F4EC)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                textStyle = TextStyle(color = Color.White)
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                textStyle = TextStyle(color = Color.White)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /* handle sign up */ },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.White
                )
            ) {
                Text("Sign Up", style = TextStyle(fontSize = 16.sp))
            }
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { /* handle sign in */ },
                modifier = Modifier,
                colors = ButtonDefaults.buttonColors(

                    contentColor = Color.White
                )
            ) {
                Text("Sign In", style = TextStyle(fontSize = 16.sp))
            }
        }
    }
}
@Preview
@Composable
fun AuthPrev(){
    Authpage()
}