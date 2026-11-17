package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 2.2 Column que ocupa toda la pantalla y reparte cinco textos por toda la altura
@Composable
fun ColumnaRepartida(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        repeat(5) { numero -> Text("Hola ${numero + 1}") }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnaRepartidaPreview() {
    MaterialTheme {
        ColumnaRepartida()
    }
}
