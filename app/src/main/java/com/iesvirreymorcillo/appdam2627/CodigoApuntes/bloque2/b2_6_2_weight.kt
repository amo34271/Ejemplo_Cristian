package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.6 Repartir el espacio con weight: los hijos con peso se reparten el espacio restante
// Solo se puede usar en un hijo directo de un Row (reparte el ancho) o un Column (el alto)

// Tres cajas del mismo ancho
@Composable
fun CajasMismoAncho(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(60.dp).background(Color.Red))
        Box(Modifier.weight(1f).height(60.dp).background(Color.Green))
        Box(Modifier.weight(1f).height(60.dp).background(Color.Blue))
    }
}

// Con pesos 1 y 2, la segunda ocupa el doble de ancho que la primera
@Composable
fun CajasPesosDistintos(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Box(Modifier.weight(1f).height(60.dp).background(Color.Red))
        Box(Modifier.weight(2f).height(60.dp).background(Color.Blue))
    }
}

@Preview(name = "Pesos 1, 1, 1", showBackground = true)
@Composable
fun CajasMismoAnchoPreview() {
    MaterialTheme {
        CajasMismoAncho()
    }
}

@Preview(name = "Pesos 1, 2", showBackground = true)
@Composable
fun CajasPesosDistintosPreview() {
    MaterialTheme {
        CajasPesosDistintos()
    }
}
