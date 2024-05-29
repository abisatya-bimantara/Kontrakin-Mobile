package com.example.kontrakinmobile.presentation.homeScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@Composable
fun ItemList(modifier: Modifier = Modifier) {
    Column {
        ItemComponents(
            image = R.drawable.kontrakan_1,
            namaKontrakan = "Kontrakan Permai",
            namaKecamatan = "Talawaan",
            rating = 2.5
        )
        Spacer(modifier = modifier.height(12.dp))
        ItemComponents(
            image = R.drawable.kontrakan_1,
            namaKontrakan = "Kontrakan Permai",
            namaKecamatan = "Talawaan",
            rating = 2.5
        )
        Spacer(modifier = modifier.height(12.dp))
        ItemComponents(
            image = R.drawable.kontrakan_1,
            namaKontrakan = "Kontrakan Permai",
            namaKecamatan = "Talawaan",
            rating = 2.5
        )
    }
}
