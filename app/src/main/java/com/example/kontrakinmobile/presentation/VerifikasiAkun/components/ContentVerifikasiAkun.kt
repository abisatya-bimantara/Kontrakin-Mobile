package com.example.kontrakinmobile.presentation.VerifikasiAkun.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun ContentVerifikasiAkun () {
    Column (
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(start = 19.dp, end = 19.dp, top = 10.dp),
    ){
        //ubah Card
        OutlinedTextField(
            value = "Lengkapi datamu agar proses pengajuan sewa lebih cepat.",
            onValueChange = {},
            shape = RoundedCornerShape(10.dp),
            textStyle = LocalTextStyle.current.copy(color = Color(0xff298F8F)),
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("** Kami melindungi informasi dan penggunaan data diri  pada pengguna kami", color = Color.Red)
        Spacer(modifier = Modifier.height(50.dp))
        Text("Jenis identitas", fontWeight = FontWeight.Bold,fontSize = 18.sp)
        Spacer(modifier = Modifier.height(10.dp))
        JenisIdentitas()
        Spacer(modifier = Modifier.height(20.dp))
        Text("Upload foto Identitas", fontWeight = FontWeight.Bold,fontSize = 18.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.kartu_identitas),
                contentDescription = null,
                modifier = Modifier
                    .size(97.dp)
                    .clickable { /* Handle menu item click */ },
            )
            Image(
                painter = painterResource(id = R.drawable.selfie),
                contentDescription = null,
                modifier = Modifier
                    .size(97.dp)
                    .clickable { /* Handle menu item click */ },
            )
        }
        Spacer(modifier = Modifier.height(75.dp))
        Menyetujui()
        ButtonVerifikasi()
    }
}
@Preview (showBackground = true)
@Composable
fun PreviewContentVerifikasiAkun() {
    ContentVerifikasiAkun()
}