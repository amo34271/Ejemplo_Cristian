package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 2.3 Row: la misma idea que Column, en dirección horizontal
@Composable
fun FilaMenu(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Inicio")
        Text("Buscar")
        Text("Perfil")
    }
}

@Preview(showBackground = true)
@Composable
fun FilaMenuPreview() {
    MaterialTheme {
        FilaMenu()
    }
}
