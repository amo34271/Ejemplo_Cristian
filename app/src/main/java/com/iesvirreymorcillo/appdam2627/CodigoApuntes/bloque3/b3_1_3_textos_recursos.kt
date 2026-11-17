package com.iesvirreymorcillo.ejercicios2627.bloque3.ejemplos // Cambia el paquete por el de tu proyecto

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 3.1 Textos en recursos
// Para probarlo de verdad:
//   1. Añade en res/values/strings.xml:   <string name="welcome">Welcome</string>
//   2. Añade los imports:
//        import androidx.compose.ui.res.stringResource
//        import <tu paquete>.R
//   3. Cambia el Text de abajo por:  Text(text = stringResource(R.string.welcome))
// Para traducir la app, crea res/values-es/strings.xml con <string name="welcome">Bienvenido</string>
@Composable
fun WelcomeText(modifier: Modifier = Modifier) {
    Text(text = "Welcome", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun WelcomeTextPreview() {
    MaterialTheme {
        WelcomeText(modifier = Modifier.padding(top=32.dp))
    }
}
