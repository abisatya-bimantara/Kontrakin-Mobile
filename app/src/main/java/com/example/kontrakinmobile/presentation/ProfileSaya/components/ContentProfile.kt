package com.example.kontrakinmobile.presentation.ProfileSaya.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ContentProfile() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        ProfileField(label = "Nama Lengkap", value = "Clinton Lombogia")
        ProfileField(label = "Jenis Kelamin", value = "Laki-laki")
        ProfileField(label = "Tanggal Lahir", value = "31/08/2004")
        ProfileField(label = "Pekerjaan", value = "Mahasiswa")
        ProfileField(label = "Kota Asal", value = "Manado")
        ProfileField(label = "Status", value = "Pelajar")
        ProfileField(label = "No Kontak Darurat", value = "+62895120000")
    }
}

@Composable
fun ProfileField(label: String, value: String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 19.dp, end = 19.dp, bottom = 20.dp),
        horizontalArrangement = (Arrangement.SpaceBetween)
    ) {
        Text(
            text = label,
            fontSize = 15.sp,
            color = Color.Gray,
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
        OutlinedTextField(
            modifier = Modifier
                .width(186.dp)
                .height(50.dp),
            readOnly = true,
            value = value,
            onValueChange = {},
            enabled = false,
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, fontSize = 15.sp),
            shape = RoundedCornerShape(15.dp),

            )
    }
}