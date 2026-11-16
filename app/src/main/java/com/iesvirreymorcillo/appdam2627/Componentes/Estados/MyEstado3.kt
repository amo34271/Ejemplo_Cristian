package com.iesvirreymorcillo.appdam2627.Componentes.Estados

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
// Estados
fun MyEstado3(modifier: Modifier) {
    //con el by se puede simplificar la variable (evita poner numero.value)
    var numero by rememberSaveable() { mutableStateOf(0) }
    Column {
        Text(text = "Púlsame: ${numero}",
            fontSize = 32.sp,
            modifier = modifier.clickable { numero += 1 })
        //Clica en el fondo del cuadro ¿suma 1?
        Text(text = "Púlsame: ${numero}",
            fontSize = 32.sp,
            modifier = modifier.padding(50.dp).clickable{ numero +=1 })
        //Clica en el fondo del cuadro ¿suma 1?
        Text(text = "Púlsame: ${numero}",
            fontSize = 32.sp,
            modifier = modifier.clickable{ numero +=1 }.padding(50.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun MyEstado3Preview() {
    MyEstado3(modifier = Modifier.padding(top = 32.dp).background(color = Color.Cyan))
}
