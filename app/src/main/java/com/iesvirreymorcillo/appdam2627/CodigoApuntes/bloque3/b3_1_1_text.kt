package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 3.1 Text en profundidad: un título de una sola línea que termina en «...» si no cabe
@Composable
fun LongTitleText(modifier: Modifier = Modifier) {
    Text(
        text = "A very long title that does not fit in a single line",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF1565C0),
        textAlign = TextAlign.Center,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        modifier = modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true, widthDp = 250)
@Composable
fun LongTitleTextPreview() {
    MaterialTheme {
        LongTitleText(modifier = Modifier.padding(top=32.dp))
    }
}
