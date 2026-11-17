package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// 1.7 Text: el componente básico para mostrar texto
// Los tamaños de texto usan sp (respetan el tamaño de fuente elegido por el usuario)
@Composable
fun TextoConEstilo() {
    Text(
        text = "Hola, Compose",
        color = Color.DarkGray,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun TextoConEstiloPreview() {
    MaterialTheme {
        TextoConEstilo()
    }
}
