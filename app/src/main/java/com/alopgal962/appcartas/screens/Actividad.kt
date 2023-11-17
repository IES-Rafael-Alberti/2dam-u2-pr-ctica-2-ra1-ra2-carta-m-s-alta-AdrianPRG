package com.alopgal962.appcartas.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alopgal962.appcartas.cass.Baraja

@Preview
@Composable
fun pantalla(){
    var baraja=Baraja()
    baraja.crearbaraja()
    var id by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            imagen2(id = id)
        }
        Row(modifier = Modifier.padding(top = 25.dp)) {
            Button(onClick = { id=baraja.damecarta() }) {
                Text(text = "DAME CARTA")
            }
            Button(modifier = Modifier.padding(start = 20.dp),onClick = { baraja.barajar() }) {
                Text(text = "REINICIAR")
            }
        }
    }
}

@Composable
fun imagen2(id: String) {
    if (id.isNotEmpty()) {
        val context = LocalContext.current
        val obtenerid = context.resources.getIdentifier(id, "drawable", context.packageName)
        val imagen = painterResource(id = obtenerid)
        Image(painter = imagen, contentDescription = "imagen")
    }
}