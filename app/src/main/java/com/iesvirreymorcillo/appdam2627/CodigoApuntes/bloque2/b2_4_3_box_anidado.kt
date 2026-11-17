package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.4 contentAlignment solo coloca a los hijos DIRECTOS de esa caja
@Composable
fun CajasAnidadas(modifier: Modifier = Modifier) {
    // La caja exterior centra la caja roja
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier.size(200.dp).background(Color.Red),
            contentAlignment = Alignment.Center   // esta centra el texto
        ) {
            Text("Hola")
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 300)
@Composable
fun CajasAnidadasPreview() {
    MaterialTheme {
        CajasAnidadas()
    }
}
