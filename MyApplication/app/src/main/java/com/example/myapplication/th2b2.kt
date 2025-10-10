package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun CheckEmailBox(){
    var input by remember { mutableStateOf("") }
    var resultMessage by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20B2AA)),
        contentAlignment = Alignment.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            TextField(
                value=input,
                onValueChange = { input = it },
                label = { Text("Email") }

            )
            Button(onClick = {
                resultMessage = ""

                if (input.isBlank() == true || input == null) {
                    resultMessage = "Email không hợp lệ"
                } else if (input.contains("@")) {
                    resultMessage = "Bạn đã nhập Email hợp lệ"
                } else {
                    resultMessage = "Email không đúng định dạng"
                }
            }) {
                Text("Kiểm tra")
            }
            Text(
                text = resultMessage,
                color=Color.Red
            )
        }



    }
}