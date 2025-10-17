package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun UIC(){
    var name by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }
    var greet by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Image
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(120.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Text
        Text(
            text = "Xin chào!",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        // TextField
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nhập tên của bạn") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Row: chứa Checkbox và Text nhiều style
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )

            Text(
                buildAnnotatedString {
                    withStyle(
                        SpanStyle(
                            color = Color.Blue,
                            fontStyle = FontStyle.Italic,
                            fontSize = 22.sp
                        )
                    ) {
                        append("Tôi ")
                    }
                    withStyle(
                        SpanStyle(
                            fontWeight = FontWeight.Bold,
                            textDecoration = TextDecoration.Underline,
                            fontSize = 10.sp
                        )
                    ) {
                        append("đồng ý ")
                    }
                    withStyle(
                        SpanStyle(
                            color = Color.Red,
                            textDecoration = TextDecoration.Underline,
                            fontSize = 16.sp
                        )
                    ) {
                        append("với điều khoản")
                    }
                },
                fontSize = 22.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Box: căn giữa nút
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(onClick = {
                if (name.isNotBlank() && isChecked) {
                    greet = true
                } else {
                    greet = false
                }
            }) {
                Text("Xác nhận")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        if(greet ==true){
            Text(text= "Xin chào $name")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UICPreview() {
    MyApplicationTheme {
        UIC()
    }
}