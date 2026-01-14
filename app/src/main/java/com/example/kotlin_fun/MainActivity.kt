package com.example.kotlin_fun

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_fun.ui.theme.KotlinFunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinFunTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        colour = Color.RED
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, colour: Int) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
//        color = colour,
//        fontSize = 32,
//        fontStyle = FontStyle.Normal,
//        fontWeight = FontWeight.Bold,
//        fontFamily = null,
//        letterSpacing = 0.1,
//        textDecoration = null,
//        textAlign = TextAlign.Center,
//        lineHeight = 1,
//        overflow = TextOverflow.Clip,
//        softWrap = true,
//        maxLines = 10,
//        minLines = 1,
//        inlineContent = InlineTextContent(Placeholder(0.5, 0.5)),

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinFunTheme {
        Greeting("Android", colour = Color.RED)
    }
}