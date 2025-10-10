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
fun CheckInfoScreen() {
    var ageInput by remember { mutableStateOf("") }
    var resultMessage by remember { mutableStateOf("") }
    var nameInput by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20B2AA)),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier
                .background(Color(0xFF808080))
                .size(width=300.dp, height=300.dp)
                .padding(24.dp),
        contentAlignment = Alignment.Center,
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
            TextField(
                value=nameInput,
                onValueChange = { nameInput = it },
                label = { Text("Nhập họ và tên") }

            )
            Spacer(modifier = Modifier.height(16.dp))
            TextField(
                value = ageInput,
                onValueChange = { ageInput = it },
                label = { Text("Nhập tuổi") }
            )

            Button(onClick = {
                val age = ageInput.toIntOrNull()
                resultMessage = if (nameInput.isBlank() && ageInput.isBlank()) {
                    "Vui lòng nhập thông tin"
                } else if (nameInput.isBlank()) {
                    "Vui lòng nhập họ và tên"
                } else if (ageInput.isBlank()) {
                    "Vui lòng nhập tuổi"
                } else if (age == null || age < 0) {
                    "Thông tin không hợp lệ, vui lòng nhập lại"
                } else if (age > 65) {
                    "Người già"
                } else if (age > 6) {
                    "Người lớn"
                } else if (age > 2) {
                    "Trẻ em"
                } else {
                    "Em bé"
                }

            }) {
                Text("Kiểm tra")
            }
                    Text(text = resultMessage)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CenterImagePreview() {
    MyApplicationTheme {
        CheckInfoScreen()
    }
}
