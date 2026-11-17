package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 1.7 El orden de los modificadores importa: se aplican de fuera hacia dentro

// 1. El fondo cubre el texto Y el relleno
@Composable
fun FondoAntesDelRelleno() {
    Text("Hola", modifier = Modifier.background(Color.Yellow).padding(16.dp))
}

// 2. El relleno queda fuera; el fondo solo cubre el texto
@Composable
fun RellenoAntesDelFondo() {
    Text("Hola", modifier = Modifier.padding(16.dp).background(Color.Yellow))
}

@Preview(name = "1 background → padding", showBackground = true)
@Composable
fun FondoAntesDelRellenoPreview() {
    MaterialTheme {
        FondoAntesDelRelleno()
    }
}

@Preview(name = "2 padding → background", showBackground = true)
@Composable
fun RellenoAntesDelFondoPreview() {
    MaterialTheme {
        RellenoAntesDelFondo()
    }
}
