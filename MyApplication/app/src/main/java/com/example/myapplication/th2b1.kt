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




fun isInt(input:String):Boolean{
    if(input.toIntOrNull()!=null){
        return true
    }
    return false
}
@Composable
fun InputBox() {
    var input by remember { mutableStateOf("") }
    var count by remember { mutableStateOf(0) }
    var errorMessage by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20B2AA)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(){

                TextField(
                    modifier = Modifier.size(width = 200.dp, height = 60.dp),
                    value = input,
                    onValueChange = {
                        input = it
                    },
                    label = { Text("Nhập vào số lượng") }
                )
                Button(
                    modifier = Modifier.size(width = 100.dp, height = 60.dp),
                    onClick={
                        if(isInt(input)==true){
                            count=input.toInt()
                            errorMessage = ""
                        }
                        else{
                            count = 0
                            errorMessage = "Dữ liệu bạn nhập không hợp lệ"
                        }
                    }
                ){
                    Text("Tạo")
                }
            }
            if (errorMessage.isNotEmpty()) {
                Text(
                    text = errorMessage,
                    color = Color.Red,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }else{
                errorMessage = ""
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    for(i in 1..count){
                        Box(
                            modifier = Modifier
                                .padding(4.dp)
                                .size(width = 200.dp, height = 60.dp)                                .background(Color.Red),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "$i",
                                color = Color.White
                            )
                        }
                    }
                }
            }


        }
    }
}

