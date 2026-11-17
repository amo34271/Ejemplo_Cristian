package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.10 Dividir la pantalla en composables con parámetros

// Una pieza que se repite: los datos que cambian son parámetros.
// El modifier recibido va el PRIMERO de la cadena.
@Composable
fun TarjetaDato(titulo: String, valor: Int, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(80.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF1565C0)),
        contentAlignment = Alignment.Center
    ) {
        Text("$titulo: $valor", color = Color.White)
    }
}

// Quien llama decide cómo encaja: le pasa weight desde el Row
@Composable
fun FilaResultados(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        TarjetaDato("Victorias", 12, Modifier.weight(1f))
        TarjetaDato("Empates", 3, Modifier.weight(1f))
        TarjetaDato("Derrotas", 5, Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun FilaResultadosPreview() {
    MaterialTheme {
        FilaResultados(Modifier.padding(8.dp))
    }
}
