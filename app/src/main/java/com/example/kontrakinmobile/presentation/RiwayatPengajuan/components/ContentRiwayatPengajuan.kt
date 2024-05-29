package com.example.kontrakinmobile.presentation.RiwayatPengajuan.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun ContentRiwayatPengajuan() {
    Column (modifier = Modifier.fillMaxWidth(1f)){
        Image(
            painter = painterResource(id = R.drawable.riwayat_pengajuan),
            contentDescription = null,
            modifier = Modifier
                .size(241.dp)
                .align(Alignment.CenterHorizontally),)
        Text(text = "Kamu belum  booking nih, yuk mulai booking kontrakan yang kamu inginkan.",
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .size(width = 295.dp, height = 40.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}