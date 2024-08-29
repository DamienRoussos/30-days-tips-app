package com.example.thirtydaysofwelnessandstressmanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.TipsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TipsAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    TipsApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TipsAppTheme {
        TipsApp()
//        TipsCard(tip = Tip(day = R.string.day1, title = R.string.day1title, image = R.drawable.imageday1, R.string.day1description))
    }
}