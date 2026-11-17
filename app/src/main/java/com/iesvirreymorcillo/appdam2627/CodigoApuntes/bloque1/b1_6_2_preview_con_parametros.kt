package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 1.6 Previews y parámetros: una @Preview no puede recibir parámetros,
// así que se crea una función de preview que llama al composable con datos de ejemplo
@Composable
fun TarjetaPerfil(nombre: String, edad: Int) {
    // ...
    Text("$nombre, $edad años")
}

@Preview(showBackground = true)
@Composable
fun TarjetaPerfilPreview() {
    MaterialTheme {
        TarjetaPerfil(nombre = "Ana", edad = 20)
    }
}
