package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 3.2 Botones: parámetros habituales (modifier, shape, colors)
@Composable
fun SaveButton(modifier: Modifier = Modifier) {
    Button(
        onClick = { },
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF2E7D32),
            contentColor = Color.White
        )
    ) {
        Text("Save")
    }
}

@Preview(showBackground = true)
@Composable
fun SaveButtonPreview() {
    MaterialTheme {
        SaveButton(modifier = Modifier.padding(top=32.dp))
    }
}
