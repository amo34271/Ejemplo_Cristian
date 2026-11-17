package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 3.2 Botones con icono
// Si Icons aparece en rojo, añade en build.gradle.kts (Module :app):
//   implementation("androidx.compose.material:material-icons-core")
@Composable
fun IconButtonsExample(modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Button(onClick = { }) {
            Icon(Icons.Default.Add, contentDescription = null) // el texto ya dice lo mismo
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Add")
        }
        IconButton(onClick = { }) {
            Icon(Icons.Default.Add, contentDescription = "Add") // icono solo: necesita descripción
        }
    }
}

@Preview(showBackground = true)
@Composable
fun IconButtonsExamplePreview() {
    MaterialTheme {
        IconButtonsExample(modifier = Modifier.padding(top=32.dp))
    }
}
