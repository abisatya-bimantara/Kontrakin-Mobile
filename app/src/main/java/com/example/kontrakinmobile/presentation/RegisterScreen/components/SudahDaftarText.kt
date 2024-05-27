package com.example.kontrakinmobile.presentation.RegisterScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BelumDaftarText(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Text(text = "Belum Punya Akun?", textAlign = TextAlign.Center)
        Spacer(modifier = modifier.width(4.dp))
        Text(text = "Daftar", color = Color(0xFF7BC0B5), modifier = modifier.clickable {  })
    }
}

@Preview
@Composable
private fun BelumDaftarTextPreview() {
    BelumDaftarText()
}