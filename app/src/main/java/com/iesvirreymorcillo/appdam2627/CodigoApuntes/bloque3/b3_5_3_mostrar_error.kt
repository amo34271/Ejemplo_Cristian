package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

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

// 3.5 Mostrar un error: el error no es un estado nuevo, se calcula a partir del estado
@Composable
fun EmailErrorField(modifier: Modifier = Modifier) {
    var email by rememberSaveable { mutableStateOf("") }
    val emailError = email.isNotEmpty() && !email.contains("@")

    OutlinedTextField(
        value = email,
        onValueChange = { email = it },
        label = { Text("Email") },
        isError = emailError,
        supportingText = { if (emailError) Text("Enter a valid email") },
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun EmailErrorFieldPreview() {
    MaterialTheme {
        EmailErrorField()
    }
}
