package com.example.mymarket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymarket.ui.theme.MyMarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMarketTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFA500) // 주황색
                ) {
                    Greeting("Hwangsonglee market", Modifier.background(color = Color.Green).padding(16.dp).fillMaxWidth())
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome $name!",
        modifier = modifier
            .background(color = Color.Green) // 초록색 배경
            .padding(16.dp) // 여백 추가
            .fillMaxWidth() // 최대 너비로 채우기
            .border(2.dp, Color.Black) // 테두리 추가
            .clip(RoundedCornerShape(8.dp)) // 둥근 모서리 적용
            .padding(8.dp), // 내부 여백 추가
        fontWeight = FontWeight.Bold // 볼드체로 설정
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyMarketTheme {
        Greeting("Hwangsonglee 마켓")
    }
}