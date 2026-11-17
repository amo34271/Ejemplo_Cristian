package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.4 Box: centrar un elemento dentro de un espacio
@Composable
fun CajaCentrada(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.size(120.dp).background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text("Centro")
    }
}

@Preview(showBackground = true)
@Composable
fun CajaCentradaPreview() {
    MaterialTheme {
        CajaCentrada()
    }
}
