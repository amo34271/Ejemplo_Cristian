package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.8 Texto sobre un fondo de color: un Box con contentAlignment = Alignment.Center
@Composable
fun CajaAzul(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(90.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFF2196F3)),
        contentAlignment = Alignment.Center
    ) {
        Text("Azul", color = Color.White, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun CajaAzulPreview() {
    MaterialTheme {
        CajaAzul(Modifier.width(150.dp))   // le damos ancho desde fuera
    }
}
