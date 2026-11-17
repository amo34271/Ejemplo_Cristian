package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.11 Repetir la interfaz a partir de datos

// La lista va FUERA del composable: no cambia, así que no se vuelve a crear en cada redibujado
val jugadores = listOf(
    Triple("Ana", 20, Color(0xFFE91E63)),
    Triple("Luis", 22, Color(0xFF3F51B5)),
    Triple("Marta", 19, Color(0xFF4CAF50))
)

@Composable
fun ListaJugadores(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // forEachIndexed da la posición (empieza en 0) y el elemento;
        // (nombre, edad, color) desestructura el Triple
        jugadores.forEachIndexed { indice, (nombre, edad, color) ->
            FilaJugador(numero = indice + 1, nombre = nombre, edad = edad, color = color)
        }
    }
}

// En los apuntes no se detalla FilaJugador: esta es una versión sencilla
@Composable
fun FilaJugador(numero: Int, nombre: String, edad: Int, color: Color) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(color),
            contentAlignment = Alignment.Center
        ) {
            Text("$numero", color = Color.White, fontWeight = FontWeight.Bold)
        }
        Text("$nombre ($edad años)")
    }
}

@Preview(showBackground = true)
@Composable
fun ListaJugadoresPreview() {
    MaterialTheme {
        ListaJugadores(Modifier.padding(16.dp))
    }
}
