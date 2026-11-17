package com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.TextField

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.iesvirreymorcillo.myappdam1.ComponentesMaterial3.Text.MyText6param


@Composable
fun MyTextField0M3(modifier: Modifier) {
    var user by rememberSaveable() { mutableStateOf("") }

    Column(modifier = modifier) {
        MyTextField0(user = user) {user = it}
    }
}


@Composable
fun MyTextField0(user: String, onUserChange: (String) -> Unit) {
    TextField(value = user, onValueChange = { onUserChange(it) })
}

@Preview
@Composable
fun MyTestTextField0M3() {
    MyTextField0M3(modifier = Modifier)
}

