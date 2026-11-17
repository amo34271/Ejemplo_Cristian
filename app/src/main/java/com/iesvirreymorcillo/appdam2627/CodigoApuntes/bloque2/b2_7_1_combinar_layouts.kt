package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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

// 2.7 Combinar layouts: tres zonas de la misma altura; la del medio contiene una fila
//
// Column                          // toda la pantalla
// |-- Box (ROJO)                  // peso 1
// |-- Box (AZUL)                  // peso 1
// |   \-- Row                     // dentro de la caja azul
// |       |-- Box (GRIS)
// |       \-- Box (BLANCO)
// \-- Box (AMARILLO)              // peso 1
@Composable
fun AreasDeColor(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) { Text("ROJO") }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Row(modifier = Modifier.fillMaxWidth().height(40.dp)) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center
                ) { Text("GRIS") }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) { Text("BLANCO") }
            }
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) { Text("AMARILLO") }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AreasDeColorPreview() {
    MaterialTheme {
        AreasDeColor()
    }
}
