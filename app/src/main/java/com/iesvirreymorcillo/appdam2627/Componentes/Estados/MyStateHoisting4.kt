package com.iesvirreymorcillo.appdam2627.Componentes.Estados

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
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
        Text(text = "Numero 1: $numero1",
            modifier=Modifier.fillMaxWidth()
                              .background(color = Color.Red)
                              .padding(top=32.dp, bottom = 10.dp),
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            color=Color.White,)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Numero 2: $numero2", modifier= Modifier.fillMaxWidth().background(color= Color.Green),fontSize = 32.sp, textAlign = TextAlign.End)
        Spacer(modifier = Modifier.height(32.dp))
        operar(numero1, numero2, "sumar",resulSuma) {resulSuma = numero1 + numero2}
        imprimirResultado2(resulSuma,"suma")
        Spacer(modifier = Modifier.height(32.dp))
        operar(numero1, numero2, "restar",resulResta) {resulResta = numero1 - numero2}
        imprimirResultado2(resulResta, "resta")

    }
}

@Composable
fun operar(numero1: Int, numero2: Int, operacion: String,  resultado: Int, onClick: () -> Unit) {
    Text(text = "Púlsame para $operacion $numero1 y $numero2",
        modifier = Modifier.clickable { onClick() }
            .fillMaxWidth()
            .background(color = Color.Magenta),
        fontSize = 32.sp)
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
