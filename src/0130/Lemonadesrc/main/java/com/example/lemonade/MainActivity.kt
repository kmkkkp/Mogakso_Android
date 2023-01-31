package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import java.io.StringReader

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background
                ) {
                    LemonApp()
                }
            }
        }
    }
}

@Composable
fun LemonApp() {
    var currentStep by remember { mutableStateOf(1) }//무슨 화면을 보여 줄지
    var squeezeCount by remember { mutableStateOf(0) }//레몬을 몇 번 짤 건지
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ){
        when(currentStep) {
            1 -> {
                LemonTextAndImage(
                    textLabelId = R.string.screen_1,
                    drawableLabelId = R.drawable.lemon_tree,
                    contentDescriptionId = R.string.Lemon_tree_content_description,
                    onImageClicked = {
                        currentStep = 2
                        squeezeCount = (2..4).random()
                    }
                )
            }

            2 -> {
                LemonTextAndImage(
                    textLabelId = R.string.screen_2,
                    drawableLabelId = R.drawable.lemon_squeeze,
                    contentDescriptionId = R.string.Lemon_content_description,
                    onImageClicked = {
                        if (squeezeCount==0) {
                            currentStep = 3
                        }
                        else squeezeCount--
                    })
            }
            3 -> {
                LemonTextAndImage(
                    textLabelId = R.string.screen_3,
                    drawableLabelId = R.drawable.lemon_drink,
                    contentDescriptionId = R.string.Glass_with_lemon_content_description,
                    onImageClicked = {
                        currentStep = 4
                  })
            }
            4 -> {
                LemonTextAndImage(
                    textLabelId = R.string.screen_4,
                    drawableLabelId = R.drawable.lemon_restart,
                    contentDescriptionId = R.string.Empty_glass_content_description,
                    onImageClicked = {
                        currentStep = 1
                    })
            }
        }
    }
}

@Composable
fun LemonTextAndImage(
    textLabelId: Int,
    drawableLabelId: Int,
    contentDescriptionId: Int,
    onImageClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column{
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = stringResource(textLabelId),
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(drawableLabelId),
                contentDescription = stringResource(id = contentDescriptionId),
                modifier = Modifier
                    .wrapContentSize()
                    .clickable(onClick = onImageClicked)
                    .border(
                        BorderStroke(2.dp, Color(105, 205, 216)),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(16.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LemonadeTheme {
        LemonApp()
   }
}