package com.example.kontrakinmobile.presentation.KontrakanSaya.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun CardContent(){
    Column (modifier = Modifier
        .fillMaxWidth()) {
    Text(text = "Belum ada kontrakan yang di sewa",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier.align(Alignment.CenterHorizontally))
    Text(text = "Yuk, sewa di kontrakcepat atau masukkan " +
            "kode dari pemilik kontrakan untuk aktifkan" +
            " halaman ini!",
        fontSize = 15.sp,
        textAlign = TextAlign.Start,
        modifier = Modifier
            .size(285.dp, 52.dp)
            .align(Alignment.CenterHorizontally)
    )
    Image(
        painter = painterResource(id = R.drawable.kontrakan_sett),
        contentDescription = null,
        modifier = Modifier
            .size(241.dp)
            .align(Alignment.CenterHorizontally),)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardContent() {
    CardContent()
}