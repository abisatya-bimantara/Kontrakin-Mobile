package com.example.kontrakinmobile.presentation.LoginScreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun EmailFieldComponents(modifier: Modifier = Modifier, label: String, placeholder: String) {
    var text by remember {
        mutableStateOf("")
    }
    OutlinedTextField(
        value =text,
        onValueChange ={text = it},
        label = { Text(text = label)},
        placeholder = { Text(text = placeholder)},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        modifier = modifier.fillMaxWidth()
    )
}