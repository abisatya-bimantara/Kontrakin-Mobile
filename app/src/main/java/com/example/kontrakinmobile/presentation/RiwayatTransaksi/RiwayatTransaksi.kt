package com.example.kontrakinmobile.presentation.RiwayatTransaksi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.SettingsScreen.components.Header

@Composable
fun RiwayatTransaksi() {
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
                        .clickable { /* Handle menu item click */ },
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f
                    )
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = "Riwayat Transaksi",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(79.dp))

            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Column{
                Text(text = "Dari", modifier = Modifier.padding(start = 15.dp))
                    OutlinedTextField(
                        modifier = Modifier
                            .width(175.dp)
                            .height(50.dp),
                        value = "06 Januari 2024",
                        onValueChange = {},
                        enabled = true,
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, fontSize = 15.sp),
                        shape = RoundedCornerShape(15.dp),
                        trailingIcon = {Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable { /* Handle menu item click */ }
                                .size(20.dp),
                        )}

                        )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column{
                Text(text = "Sampai",modifier = Modifier.padding(start = 15.dp))
                    OutlinedTextField(
                        modifier = Modifier
                            .width(175.dp)
                            .height(50.dp),
                        value = "01 Juni 2024",
                        onValueChange = {},
                        enabled = true,
                        singleLine = true,
                        textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, fontSize = 15.sp),
                        shape = RoundedCornerShape(15.dp),
                        trailingIcon = {Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .clickable { /* Handle menu item click */ }
                                .size(20.dp),
                        )}
                        )
                }
            }
            Spacer(modifier = Modifier.height(75.dp))
            Image(
                painter = painterResource(id = R.drawable.riwayat_transaksi),
                contentDescription = null,
                modifier = Modifier
                    .size(241.dp)
                    .align(Alignment.CenterHorizontally),)
            Spacer(modifier = Modifier.height(97.dp))
            Text(text = "Belum ada riwayat transaksi baru", modifier = Modifier.align(Alignment.CenterHorizontally))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RiwayatTransaksiPreview() {
    RiwayatTransaksi()
}