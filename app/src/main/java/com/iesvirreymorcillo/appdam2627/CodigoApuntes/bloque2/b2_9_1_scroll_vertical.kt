package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.9 Desplazamiento vertical
// - El padding va DESPUÉS de verticalScroll para que se desplace con el contenido.
// - En una columna con scroll no uses Arrangement.Center, SpaceBetween ni weight vertical.
@Composable
fun ColumnaDesplazable(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(25) { numero ->
            Text("Elemento ${numero + 1}")
        }
    }
}

// La preview no se desplaza: pulsa Interactive o ejecútalo en el emulador
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnaDesplazablePreview() {
    MaterialTheme {
        ColumnaDesplazable()
    }
}
