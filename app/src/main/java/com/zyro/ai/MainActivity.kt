package com.zyro.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ZYROApp()
        }
    }
}

@Composable
fun ZYROApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF020817),
                        Color(0xFF061B38),
                        Color(0xFF000000)
                    )
                )
            )
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "ZYRO",
            color = Color(0xFF00BFFF),
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "BEYOND INTELLIGENCE",
            color = Color.White,
            fontSize = 13.sp
        )

        Spacer(modifier = Modifier.height(45.dp))

        Box(
            modifier = Modifier
                .size(180.dp)
                .background(
                    Color(0xFF0879C9),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Z",
                color = Color.White,
                fontSize = 90.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(35.dp))

        Text(
            text = "SYSTEM ONLINE",
            color = Color(0xFF00FFAA),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {}) {
            Text("ACTIVATE ZYRO")
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Your Intelligence. Your Companion.",
            color = Color.LightGray,
            fontSize = 14.sp
        )
    }
}
