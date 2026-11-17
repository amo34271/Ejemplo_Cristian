package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.8 Fondo, forma y borde: el orden habitual para una tarjeta
@Composable
fun TarjetaConForma(modifier: Modifier = Modifier) {
    Text(
        text = "Una tarjeta con esquinas redondeadas",
        modifier = modifier
            .fillMaxWidth()                                    // 1. tamaño
            .clip(RoundedCornerShape(12.dp))                   // 2. recortar las esquinas
            .background(Color.White)                           // 3. pintar el interior
            .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))  // 4. borde con la misma forma
            .padding(10.dp)                                    // 5. espacio interior
    )
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F5F5)
@Composable
fun TarjetaConFormaPreview() {
    MaterialTheme {
        TarjetaConForma(Modifier.padding(16.dp))
    }
}
