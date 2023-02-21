package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.model.Topic
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp() {
    CoursesTheme {
        CourseList(topicList = DataSource.topics)
    }
}

@Composable
private fun CourseList(topicList: List<Topic>, modifier: Modifier = Modifier){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(topicList){topic->
            CourseCard(topic)
        }
    }
}

@Composable
fun CourseCard(topic: Topic, modifier: Modifier = Modifier){
    Card(modifier = Modifier.height(68.dp)){
        Row{
            Image(
                painter = painterResource(id = topic.drawableResourceId),
                contentDescription = stringResource(id = topic.stringResourceId),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(68.dp),
                contentScale = ContentScale.Fit
            )
            Column(
                modifier = Modifier.padding(start = 16.dp,top = 16.dp, bottom = 8.dp)
            ) {
                Text(
                    text = stringResource(id = topic.stringResourceId),
                    modifier =Modifier.padding( end = 16.dp),
                    style = MaterialTheme.typography.body2
                )
                Row(
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null
                    )
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = topic.courseNum.toString(),
                        style = MaterialTheme.typography.caption
                    )

                }
            }



        }
    }
}

@Preview
@Composable
private fun CourseCardPreview(){
    CourseCard(Topic(R.string.architecture, 58, R.drawable.architecture))
}