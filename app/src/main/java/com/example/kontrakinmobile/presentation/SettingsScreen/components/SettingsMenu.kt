package com.example.kontrakinmobile.presentation.SettingsScreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@Composable
fun SettingsMenu(){
    Column {
        Card(
            modifier = Modifier.fillMaxHeight(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Column(modifier = Modifier.padding(top = 25.dp)) {
                MenuItem(iconId = R.drawable.ic_profile, label = "Profile Saya")
                MenuItem(iconId = R.drawable.ic_home, label = "Kontrakan Saya")
                MenuItem(iconId = R.drawable.ic_history, label = "Riwayat Pengajuan Sewa")
                MenuItem(iconId = R.drawable.ic_transaction, label = "Riwayat Transaksi")
                MenuItem(iconId = R.drawable.ic_verification, label = "Verifikasi Akun")
                MenuItem(iconId = R.drawable.ic_about_us, label = "Tentang Kami")
            }
        }
    }
}
@Preview
@Composable
fun PreviewSettingsMenu()
{
    SettingsMenu()
}