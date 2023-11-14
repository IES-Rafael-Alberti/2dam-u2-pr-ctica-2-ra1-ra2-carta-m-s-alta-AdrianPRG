package com.alopgal962.appcartas.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview
@Composable
fun pantalla(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        Row {
            Button(onClick = { }) {
                Text(text = "DAME CARTA")
            }
            Button(modifier = Modifier.padding(start = 20.dp),onClick = { /*TODO*/ }) {
                Text(text = "REINICIAR")
            }
        }
    }
}



