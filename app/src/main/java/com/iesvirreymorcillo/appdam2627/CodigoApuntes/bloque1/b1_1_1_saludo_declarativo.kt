package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 1.1 Interfaz declarativa: la función describe la interfaz para los datos que recibe
//
// Con Views (imperativo) sería así (XML + código que modifica la vista):
//   <TextView android:id="@+id/saludo" ... />
//   findViewById<TextView>(R.id.saludo).text = "¡Hola, $nombre!"
//
// (En los apuntes se llama Saludo; aquí SaludoDeclarativo para no chocar con el del 1.4)
@Composable
fun SaludoDeclarativo(nombre: String) {
    Text(text = "¡Hola, $nombre!")
}

@Preview(showBackground = true)
@Composable
fun SaludoDeclarativoPreview() {
    MaterialTheme {
        SaludoDeclarativo("Android")
    }
}
