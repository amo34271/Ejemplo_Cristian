package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 1.7 Modificadores: se encadenan con puntos
// fillMaxWidth() hace lo que hacía match_parent en XML
@Composable
fun TextoConModificadores() {
    Text(
        text = "Hola",
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TextoConModificadoresPreview() {
    MaterialTheme {
        TextoConModificadores()
    }
}
