package com.example.kontrakinmobile.presentation.TentangKami.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.kontrakinmobile.R

@Composable
fun ContentTentangKami() {
    Column (
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(start = 19.dp, end = 19.dp, top = 10.dp),
    ) {
        Text(text = "Aplikasi Pencari Kontrakan Rumah Impian Anda, Sekarang Dalam Genggaman.", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "   Cari Kontrakan yang akurat dan tepercaya kini semakin mudah. Membantu masyarakat untuk lebih mudah mencari kontrakan layak huni."
            ,textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.tentang_kami),
            contentDescription = null,
            modifier = Modifier
                .size(165.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Latar Belakang", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "   Kontrak cepat menghadirkan solusi modern bagi para pencari hunian sewa dengan fitur-fitur yang memudahkan proses pencarian, pemilihan, dan manajemen kontrakan. Dengan antarmuka yang intuitif dan fitur pencarian yang canggih."
            ,textAlign = TextAlign.Justify
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "   Aplikasi ini memungkinkan pengguna untuk menemukan kontrakan yang sesuai dengan kebutuhan mereka, mulai dari lokasi hingga fasilitas yang tersedia. Selain itu, aplikasi ini juga memfasilitasi komunikasi antara penyewa dan pemilik, serta menyediakan fitur-fitur tambahan seperti pembayaran sewa dan pemeliharaan properti secara online. Dengan demikian, aplikasi kontrak cepat mengubah cara orang mencari dan mengelola hunian sewa dengan lebih efisien dan praktis."
            ,textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewContentTentangKami(){
    ContentTentangKami()
}