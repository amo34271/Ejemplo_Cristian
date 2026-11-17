package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

// 3.4 rememberSaveable: como remember, pero además sobrevive al giro de pantalla
@Composable
fun SaveableCounter() {
    var count by rememberSaveable { mutableStateOf(0) }
    Button(onClick = { count++ }) {
        Text("Clicks: $count")
    }
}

// Para ver la diferencia con remember, ejecútalo en el emulador y gira la pantalla
@Preview(showBackground = true)
@Composable
fun SaveableCounterPreview() {
    MaterialTheme {
        SaveableCounter()
    }
}
