package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 1.7 El parámetro modifier: se aplica al elemento raíz para que
// quien llama pueda cambiar su tamaño, su relleno o su posición
@Composable
fun TituloSeccion(texto: String, modifier: Modifier = Modifier) {
    Text(
        text = texto,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TituloSeccionPreview() {
    MaterialTheme {
        TituloSeccion("Mis datos")
    }
}
