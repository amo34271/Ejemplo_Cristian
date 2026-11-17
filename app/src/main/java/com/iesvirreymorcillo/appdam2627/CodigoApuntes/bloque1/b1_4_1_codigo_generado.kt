package com.iesvirreymorcillo.ejercicios2627.bloque1.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// 1.4 Leer el código generado por la plantilla Empty Activity
//
// La parte de MainActivity va en MainActivity.kt (no se repite aquí para no tener dos Activity):
//
// class MainActivity : ComponentActivity() {                        // (1)
//     override fun onCreate(savedInstanceState: Bundle?) {
//         super.onCreate(savedInstanceState)
//         enableEdgeToEdge()                                            // (2)
//         setContent {                                                  // (3)
//             MyFirstComposeAppTheme {                                  // (4)
//                 Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->   // (5)
//                     Saludo(
//                         nombre = "Android",
//                         modifier = Modifier.padding(innerPadding)
//                     )
//                 }
//             }
//         }
//     }
// }

@Composable                                                           // (6)
fun Saludo(nombre: String, modifier: Modifier = Modifier) {           // (7)
    Text(
        text = "¡Hola, $nombre!",
        modifier = modifier
    )
}

@Preview(showBackground = true)                                       // (8)
@Composable
fun SaludoPreview() {
    MaterialTheme { // en tu proyecto: el tema de tu app (MyFirstComposeAppTheme...)
        Saludo("Android")
    }
}
