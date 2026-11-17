package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 3.1 Estilos de texto del tema
@Composable
fun ThemeStylesExample(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        Text("Settings", style = MaterialTheme.typography.headlineMedium)
        Text("Choose how the app looks", style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun ThemeStylesExamplePreview() {
    MaterialTheme {
        ThemeStylesExample(modifier = Modifier.padding(top=32.dp))
    }
}
