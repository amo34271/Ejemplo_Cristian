package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 3.6 ¿Dónde debe vivir el estado? En el padre común de quien lo lee y quien lo cambia
@Composable
fun GreetingScreen(modifier: Modifier = Modifier) {
    var name by rememberSaveable { mutableStateOf("") }
    GreetingContent(name = name, onNameChange = { name = it }, modifier = modifier)
}

@Composable
fun GreetingContent(
    name: String,
    onNameChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text("Name") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        val greeting = if (name.isBlank()) "Write your name" else "Hello, $name!"
        Text(greeting, fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingContentPreview() {
    MaterialTheme {
        GreetingContent(name = "Ana", onNameChange = { })
    }
}
