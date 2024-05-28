package com.example.kontrakinmobile.presentation.SettingsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.kontrakinmobile.presentation.SettingsScreen.components.NavSetting

@Composable
fun SettingsScreen() {
    Column (modifier = Modifier.background(color=Color(0xffDAF2EE))) {
        NavSetting()
    }
}
@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}