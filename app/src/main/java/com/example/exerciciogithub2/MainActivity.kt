package com.example.exerciciogithub2

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exerciciogithub2.ui.theme.ExercicioGitHub2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicioGitHub2Theme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        Modifier
            .fillMaxSize()
    )
    {
        var myName by remember { mutableStateOf("") }
        var myNameLabel by remember { mutableStateOf("") }
        Spacer(modifier = Modifier.size(30.dp))
        Text("Ola, meu nome é: $myNameLabel", color = Color.Blue)
        Spacer(modifier = Modifier.size(10.dp))

        OutlinedTextField(
            value = myName,
            onValueChange = { myName = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Home icon",
                    Modifier.clickable {
                        myNameLabel = myName
                    }
                )
            }
        )

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExercicioGitHub2Theme {
        Greeting()
    }
}