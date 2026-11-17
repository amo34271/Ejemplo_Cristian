package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 2.2 Column: coloca a sus hijos uno debajo de otro
@Composable
fun CabeceraPerfil(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ana García", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Estudiante de 2º DAM")
        Text("Villarrobledo")
    }
}

@Preview(showBackground = true)
@Composable
fun CabeceraPerfilPreview() {
    MaterialTheme {
        CabeceraPerfil()
    }
}
