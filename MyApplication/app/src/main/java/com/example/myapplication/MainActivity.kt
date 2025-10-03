package com.example.myapplication

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.padding
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.tooling.preview.Preview
    import com.example.myapplication.ui.theme.MyApplicationTheme
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.size
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.unit.dp
    import androidx.compose.foundation.layout.Column
    import androidx.compose.ui.graphics.Color
    import androidx.compose.foundation.background
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                CenterImage()
                }
            }
        }
    }


@Composable
fun CenterImage() {
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
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Ảnh đại diện",
                modifier = Modifier.size(200.dp)
            )

            Text(
                text = "Nguyễn Xuân Hoài",
                modifier = Modifier.padding(top = 16.dp)
            )

            Text(
                text = "042205004148",
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CenterImagePreview() {
    MyApplicationTheme {
        CenterImage()
    }
}
