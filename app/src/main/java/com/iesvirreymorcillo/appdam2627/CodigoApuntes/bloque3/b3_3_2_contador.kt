package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

// 3.3 Esto SÍ funciona: estado con remember + mutableStateOf
@Composable
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Button(onClick = { count++ }) {
        Text("Clicks: $count")
    }
}

// Pulsa Interactive en la Preview para probarlo
@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    MaterialTheme {
        Counter()
    }
}
