package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.6 Relleno (padding): las tres formas de escribirlo.
// El fondo amarillo va antes del padding para que veas el relleno coloreado.
@Composable
fun EjemplosPadding(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)   // espacio ENTRE los hijos
    ) {
        Text(
            "Los cuatro lados",
            modifier = Modifier.background(Color.Yellow).padding(16.dp)
        )
        Text(
            "Horizontal y vertical",
            modifier = Modifier.background(Color.Yellow).padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Text(
            "Solo algunos lados",
            modifier = Modifier.background(Color.Yellow).padding(start = 4.dp, top = 6.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EjemplosPaddingPreview() {
    MaterialTheme {
        EjemplosPadding()
    }
}
