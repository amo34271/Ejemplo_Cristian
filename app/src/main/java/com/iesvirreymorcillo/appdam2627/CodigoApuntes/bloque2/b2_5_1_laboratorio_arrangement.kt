package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// 2.5 Laboratorio de Arrangement y Alignment (Ejercicio 2.1b)
// Antes de mirar cada preview, predice dónde estarán las piezas.

@Composable
fun Pieza(etiqueta: String, ancho: Dp, alto: Dp, color: Color) {
    Box(
        modifier = Modifier.width(ancho).height(alto).background(color),
        contentAlignment = Alignment.Center
    ) { Text(etiqueta, color = Color.White) }
}

@Composable
fun LabColumna(distribucion: Arrangement.Vertical, alineacion: Alignment.Horizontal) {
    Column(
        modifier = Modifier.size(300.dp).background(Color.LightGray),
        verticalArrangement = distribucion,
        horizontalAlignment = alineacion
    ) {
        Pieza("A", 80.dp, 50.dp, Color(0xFFE53935))
        Pieza("B", 140.dp, 50.dp, Color(0xFF43A047))
        Pieza("C", 200.dp, 50.dp, Color(0xFF1E88E5))
    }
}

@Composable
fun LabFila(distribucion: Arrangement.Horizontal, alineacion: Alignment.Vertical) {
    Row(
        modifier = Modifier.size(300.dp).background(Color.LightGray),
        horizontalArrangement = distribucion,
        verticalAlignment = alineacion
    ) {
        Pieza("A", 60.dp, 50.dp, Color(0xFFE53935))
        Pieza("B", 60.dp, 100.dp, Color(0xFF43A047))
        Pieza("C", 60.dp, 150.dp, Color(0xFF1E88E5))
    }
}

@Preview(name = "1 Por defecto", showBackground = true)
@Composable
fun LabColumna1() = LabColumna(Arrangement.Top, Alignment.Start)

@Preview(name = "2 Solo Arrangement", showBackground = true)
@Composable
fun LabColumna2() = LabColumna(Arrangement.Center, Alignment.Start)

@Preview(name = "3 Solo Alignment", showBackground = true)
@Composable
fun LabColumna3() = LabColumna(Arrangement.Top, Alignment.CenterHorizontally)

@Preview(name = "4 Los dos", showBackground = true)
@Composable
fun LabColumna4() = LabColumna(Arrangement.SpaceBetween, Alignment.End)

@Preview(name = "5 spacedBy", showBackground = true)
@Composable
fun LabColumna5() =
    LabColumna(Arrangement.spacedBy(20.dp), Alignment.CenterHorizontally)

@Preview(name = "6 Fila por defecto", showBackground = true)
@Composable
fun LabFila1() = LabFila(Arrangement.Start, Alignment.Top)

@Preview(name = "7 Fila: los dos", showBackground = true)
@Composable
fun LabFila2() = LabFila(Arrangement.SpaceEvenly, Alignment.CenterVertically)
