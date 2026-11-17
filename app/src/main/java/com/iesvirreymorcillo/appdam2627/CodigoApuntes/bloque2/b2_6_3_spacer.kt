package com.iesvirreymorcillo.ejercicios2627.bloque2.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 2.6 Spacer: un composable vacío que solo ocupa espacio.
// Útil cuando los huecos entre elementos no son todos iguales.

@Composable
fun HuecosDistintos(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Título")
        Spacer(modifier = Modifier.height(24.dp))   // aquí un hueco mayor
        Text("Primer párrafo")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Segundo párrafo")
    }
}

@Composable
fun EmpujarAlFinal(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxWidth()) {
        Text("Título")
        Spacer(modifier = Modifier.weight(1f))      // empuja "Editar" al final
        Text("Editar")
    }
}

@Preview(name = "Spacer en Column", showBackground = true)
@Composable
fun HuecosDistintosPreview() {
    MaterialTheme {
        HuecosDistintos()
    }
}

@Preview(name = "Spacer con weight en Row", showBackground = true)
@Composable
fun EmpujarAlFinalPreview() {
    MaterialTheme {
        EmpujarAlFinal()
    }
}
