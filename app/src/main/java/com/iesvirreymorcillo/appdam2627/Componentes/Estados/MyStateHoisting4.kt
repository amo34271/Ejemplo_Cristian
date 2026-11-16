package com.iesvirreymorcillo.appdam2627.Componentes.Estados

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
// Estados
fun MyStateHoisting4(modifier: Modifier) {
    var numero1 by rememberSaveable() { mutableIntStateOf(10) }
    var numero2 by rememberSaveable() { mutableStateOf(5) }
    var resulSuma by rememberSaveable() { mutableIntStateOf(0) }
    var resulResta by rememberSaveable() { mutableIntStateOf(0) }
    Column(modifier = modifier){
        Text(text = "Numero 1: $numero1", fontSize = 32.sp)
        Text(text = "Numero 2: $numero2", fontSize = 32.sp)

        operar(numero1, numero2, "sumar",resulSuma) {resulSuma = numero1 + numero2}

        imprimirResultado2(resulSuma,"suma")

        operar(numero1, numero2, "restar",resulResta) {resulResta = numero1 - numero2}

        imprimirResultado2(resulResta, "resta")
    }
}

@Composable
fun operar(numero1: Int, numero2: Int, operacion: String,  resultado: Int, onClick: () -> Unit) {
    Text(text = "Púlsame para $operacion $numero1 y $numero2",
        fontSize = 22.sp,
        modifier = Modifier.clickable { onClick() })
}

@Composable
fun imprimirResultado2(numero: Int, operacion: String) {
    Text(text = "El resultado de la $operacion es: $numero",
        fontSize = 22.sp)
}



@Preview(showBackground = true)
@Composable
fun MyStateHoisting4Preview() {
    MyStateHoisting4(modifier = Modifier.padding(top = 32.dp))
}
