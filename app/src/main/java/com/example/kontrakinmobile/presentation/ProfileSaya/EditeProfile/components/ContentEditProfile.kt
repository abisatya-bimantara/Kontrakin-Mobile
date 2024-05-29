package com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
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
fun ContentProfileEdit() {
    Column {
        EditProfileField(label = "Nama Lengkap", value = "Clinton Lombogia", nilai = 0)
        EditProfileField(label = "Jenis Kelamin", value = "Pilih Jenis Kelamin", nilai = 1)
        EditProfileField(label = "Tanggal Lahir", value = "00/00/0000", nilai = 2)
        EditProfileField(label = "Pekerjaan", value = "Pilih Pekerjaan", nilai = 1)
        EditProfileField(label = "Kota Asal", value = "Pilih Kota", nilai = 1)
        EditProfileField(label = "Status", value = "Pilih Status", nilai = 1)
        EditProfileField(label = "No Kontak Darurat", value = "+628*****", nilai = 0)

    }
}

@Composable
fun EditProfileField(label: String, value: String, nilai: Int) {
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
            value = value,
            onValueChange = {},
            enabled = true,
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start),
            trailingIcon = { if (nilai == 1) {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { /* Handle menu item click */ }
                        .size(35.dp),
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f),
                )
            }else if (nilai == 2) {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { /* Handle menu item click */ }
                        .size(25.dp),
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f),
                )
            }
            },
            shape = RoundedCornerShape(15.dp),
        )
    }
}