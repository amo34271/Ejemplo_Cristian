package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import android.content.res.Configuration
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// 1.6 Dos previews del mismo composable: modo claro y modo oscuro
// Usa el composable Saludo del archivo b1_4_1_codigo_generado.kt
//
// En tu proyecto basta con MyFirstComposeAppTheme { ... }: el tema ya cambia solo a oscuro.
// Aquí se elige el esquema de colores a mano porque MaterialTheme, sin más, siempre es claro.
@Preview(name = "Claro")
@Preview(name = "Oscuro", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SaludoPreviews() {
    MaterialTheme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme()
    ) {
        Surface {   // pinta un fondo y toma el color del texto del tema
            Saludo("Android")
        }
    }
}
