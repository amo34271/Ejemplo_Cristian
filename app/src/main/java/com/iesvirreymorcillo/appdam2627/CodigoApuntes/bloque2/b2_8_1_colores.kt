package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.8 Colores en hexadecimal: AA RR GG BB (AA = transparencia; FF opaco, 00 invisible)
@Composable
fun EjemplosColores(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Box(
            Modifier.weight(1f).height(80.dp).background(Color(0xFF2196F3)),          // un azul
            contentAlignment = Alignment.Center
        ) { Text("FF") }
        Box(
            Modifier.weight(1f).height(80.dp).background(Color(0x802196F3)),          // semitransparente
            contentAlignment = Alignment.Center
        ) { Text("80") }
        Box(
            Modifier.weight(1f).height(80.dp).background(Color(0xFF2196F3).copy(alpha = 0.5f)), // lo mismo
            contentAlignment = Alignment.Center
        ) { Text("copy") }
    }
}

@Preview(showBackground = true)
@Composable
fun EjemplosColoresPreview() {
    MaterialTheme {
        EjemplosColores()
    }
}
