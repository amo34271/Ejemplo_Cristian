package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.3 Row con desplazamiento horizontal: para cuando los elementos no caben a lo ancho
@Composable
fun FilaDesplazable(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
    ) {
        repeat(10) { numero ->
            Text("Elemento ${numero + 1}", modifier = Modifier.padding(8.dp))
        }
    }
}

// La preview no se desplaza: pulsa Interactive o ejecútalo en el emulador
@Preview(showBackground = true)
@Composable
fun FilaDesplazablePreview() {
    MaterialTheme {
        FilaDesplazable()
    }
}
