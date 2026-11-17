package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 3.2 Botones: lo que hace (onClick) y lo que muestra (su contenido)
@Composable
fun AcceptButton(modifier: Modifier = Modifier) {
    Button(onClick = { /* what happens when it is pressed */ }, modifier = modifier) {
        Text("Accept")
    }
}

@Preview(showBackground = true)
@Composable
fun AcceptButtonPreview() {
    MaterialTheme {
        AcceptButton(modifier = Modifier.padding(top=32.dp))
    }
}
