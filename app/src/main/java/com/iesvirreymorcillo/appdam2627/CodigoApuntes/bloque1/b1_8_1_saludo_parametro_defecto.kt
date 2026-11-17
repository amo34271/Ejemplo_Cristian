package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 1.8 Añadir un parámetro con valor por defecto y llamar con argumentos con nombre
// (En los apuntes se llama Saludo; aquí SaludoPersonalizado para no chocar con el del 1.4)
@Composable
fun SaludoPersonalizado(nombre: String, saludo: String = "Hola", modifier: Modifier = Modifier) {
    Text(text = "¡$saludo, $nombre!", modifier = modifier)
}

// Llamada usando el valor por defecto
@Preview(name = "Saludo por defecto", showBackground = true)
@Composable
fun SaludoPersonalizadoPreview() {
    MaterialTheme {
        SaludoPersonalizado(nombre = "Android")
    }
}

// Llamada cambiando el saludo
@Preview(name = "Otro saludo", showBackground = true)
@Composable
fun SaludoPersonalizadoBienvenidoPreview() {
    MaterialTheme {
        SaludoPersonalizado(nombre = "Compose", saludo = "Bienvenido")
    }
}
