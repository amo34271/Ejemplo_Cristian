package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 3.3 Esto NO funciona: la pantalla siempre dice «Clicks: 0»
// 1. Compose no sabe que count ha cambiado (una variable normal no se puede observar).
// 2. Si volviera a dibujar la función, count volvería a valer 0.
@Composable
fun BrokenCounter() {
    var count = 0
    Button(onClick = { count++ }) {
        Text("Clicks: $count")
    }
}

@Preview(showBackground = true)
@Composable
fun BrokenCounterPreview() {
    MaterialTheme {
        BrokenCounter()
    }
}
