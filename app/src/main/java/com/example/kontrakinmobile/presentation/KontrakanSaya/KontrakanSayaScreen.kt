package com.example.kontrakinmobile.presentation.KontrakanSaya

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.SettingsScreen.components.Header

@Composable
fun KontrakSayaScreen() {
    Column (modifier = Modifier.background(color = Color(0xffDAF2EE))){
    Header()
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp, end = 19.dp, top = 20.dp),
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { },
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f
                    )
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "Kontrakan Saya",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(79.dp))
            Text(text = "Belum ada kontrakan yang di sewa",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally))
            Text(text = "Yuk, sewa di kontrakcepat atau masukkan " +
                    "kode dari pemilik kontrakan untuk aktifkan" +
                    " halaman ini!",
                fontSize = 15.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.size(285.dp,52.dp)
                    .align(Alignment.CenterHorizontally)
                )
            Image(
                painter = painterResource(id = R.drawable.kontrakan_sett),
                contentDescription = null,
                modifier = Modifier
                    .size(241.dp)
                    .align(Alignment.CenterHorizontally),)
            Spacer(modifier = Modifier.height(97.dp))
            Column (modifier = Modifier.fillMaxWidth()) {
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
                    onClick = { /*TODO*/ },
                ) {
                    Text(text = "Cari", modifier = Modifier.padding(start = 15.dp, end = 15.dp))

                }
                Button(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
                    onClick = { /*TODO*/ },
                ) {
                    Text(text = "Masukan Kode")

                }
            }
        }
    }
}

@Composable
fun ContentKontrak() {
    Column {

    }
}

@Preview
@Composable
fun ContentPreview() {
    ContentKontrak()
}

@Preview(showBackground = true)
@Composable
fun KontrakSayaPreview() {
    KontrakSayaScreen()
}