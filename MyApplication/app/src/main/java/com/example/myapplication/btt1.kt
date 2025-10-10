package com.example.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AvatarUI() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF20B2AA)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar), // ảnh tên "avatar" trong res/drawable
                contentDescription = "Ảnh đại diện",
                modifier = Modifier
                    .size(200.dp)
                    .padding(16.dp)
            )

            Text(
                text = "Nguyễn Xuân Hoài",
                fontSize = 20.sp,
                color = Color.Black
            )

            Text(
                text = "042205004148",
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
    }
}