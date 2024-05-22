package com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.presentation.ProfileSaya.HeaderProfile

@Composable
fun ProfileSetting() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFD6E8E8))
    ){
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ){

            HeaderProfile()
            Spacer(modifier = Modifier.height(30.dp))
            ContentProfileEdit()
            ButtonEditeProfile()
        }
    }

}

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
                )
            }else if (nilai == 2) {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { /* Handle menu item click */ }
                        .size(25.dp),
                )
            }
            },
            shape = RoundedCornerShape(15.dp),
        )
    }
}
@Composable
fun ButtonEditeProfile() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            modifier = Modifier
                .padding(10.dp, top = 30.dp),
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { /*TODO*/ },
        ) {
            Text(text = "Batal")
        }
        Button(
            modifier = Modifier
                .padding(10.dp, top = 30.dp),
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { /*TODO*/ },
        ) {
            Text(text = "Simpan")
        }
    }
}

@Preview (showBackground = true)
@Composable
fun ProfileSettingPreviw() {
    ProfileSetting()
}