package com.example.kontrakinmobile.presentation.LoginScreen.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun TextFieldComponents(modifier: Modifier = Modifier, nama: String, placeholder: String) {

    var text by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = text,
        onValueChange = {text = it},
        label = { Text(text = nama)},
        placeholder = { Text(text = placeholder)}
    )
}