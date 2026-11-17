package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 1.5 Activity y pantalla en archivos separados
//
// MainActivity.kt: arranca la app y muestra la pantalla
//   setContent {
//       MyFirstComposeAppTheme {
//           PantallaLogin()
//       }
//   }

// PantallaLogin.kt: los composables que describen la pantalla
@Composable
fun PantallaLogin(modifier: Modifier = Modifier) {
    // ...
    Text("Pantalla de inicio de sesión", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun PantallaLoginPreview() {
    MaterialTheme {
        PantallaLogin()
    }
}
