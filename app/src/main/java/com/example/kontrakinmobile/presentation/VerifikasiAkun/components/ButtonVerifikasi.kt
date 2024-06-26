package com.example.kontrakinmobile.presentation.VerifikasiAkun.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonVerifikasi(){
    Column (modifier = Modifier.fillMaxWidth()) {
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { /*TODO*/ },
        ) {
            Text(text = "Simpan")

        }
    }
}

@Preview
@Composable
fun PreviewButtonVerifikasi(){
    ButtonVerifikasi()
}