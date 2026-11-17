package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 3.5 TextField: no guarda el texto por sí mismo, lo guardas tú en un estado
@Composable
fun NameField(modifier: Modifier = Modifier) {
    var name by rememberSaveable { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = { name = it },
        label = { Text("Name") },
        modifier = modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun NameFieldPreview() {
    MaterialTheme {
        NameField()
    }
}
