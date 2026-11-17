package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 3.6 Elevación de estado: el estado baja, los eventos suben

// Con estado: posee el estado
@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    var count by rememberSaveable { mutableStateOf(0) }   // state
    CounterContent(
        count = count,                                    // goes down
        onIncrement = { count++ },                        // goes up
        onReset = { count = 0 },
        modifier = modifier
    )
}

// Sin estado: recibe el valor y avisa con lambdas
@Composable
fun CounterContent(
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Count: $count", fontSize = 24.sp)
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = onIncrement) { Text("+1") }
            OutlinedButton(onClick = onReset, enabled = count > 0) {
                Text("Reset")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterContentPreview() {
    MaterialTheme {
        CounterContent(count = 3, onIncrement = { }, onReset = { })
    }
}

@Preview(showBackground = true)
@Composable
fun CounterContentZeroPreview() {
    MaterialTheme {
        CounterContent(count = 0, onIncrement = { }, onReset = { })
    }
}
