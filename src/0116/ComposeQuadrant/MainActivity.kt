package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background
                ) {
                    ComposableSet()
                }
            }
        }
    }
}

@Composable
fun ComposableSet(){
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(2f)) {
            ComposableObject("Hi", "Hello", Color.Green, Modifier.weight(1f))
            ComposableObject("Bye", "goodbye", Color.Yellow, Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            ComposableObject("Hi", "Hello", Color.Cyan, Modifier.weight(1f))
            ComposableObject("Bye", "goodbye", Color.LightGray, Modifier.weight(1f))
        }
    }
}

@Composable
fun ComposableObject(name: String, article: String, backgroundColor: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = article,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = false)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposableSet()
    }
}