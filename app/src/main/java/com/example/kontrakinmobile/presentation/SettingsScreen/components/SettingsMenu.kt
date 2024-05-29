package com.example.kontrakinmobile.presentation.SettingsScreen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.KontrakanSaya.KontrakSayaScreen
import com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.ProfileSetting
import com.example.kontrakinmobile.presentation.ProfileSaya.ProfileScreen
import com.example.kontrakinmobile.presentation.RiwayatPengajuan.RiwayatPengajuan
import com.example.kontrakinmobile.presentation.RiwayatTransaksi.RiwayatTransaksi
import com.example.kontrakinmobile.presentation.TentangKami.TentangKami
import com.example.kontrakinmobile.presentation.VerifikasiAkun.VerifikasiAkun

@Composable
fun SettingsMenu(navController: NavHostController){
    Column{
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.fillMaxHeight(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ){
            Spacer(modifier = Modifier.height(30.dp))
            Row(modifier = Modifier.clickable {
                navController.navigate("Profile") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_profile, label = "Profile Saya")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("kontrakan Saya") // Navigate to Kontrakan Saya Screen
            }) {
                MenuItem(iconId = R.drawable.ic_home, label = "Kontrakan Saya")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Riwayat Pengajuan Sewa") // Navigate to Riwayat Pengajuan Sewa Screen
            }) {
                MenuItem(iconId = R.drawable.ic_history, label = "Riwayat Pengajuan Sewa")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Riwayat Transaksi") // Navigate to Riwayat Transaksi Screen
            }) {
                MenuItem(iconId = R.drawable.ic_transaction, label = "Riwayat Transaksi")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Verifikasi Akun") // Navigate to Verifikasi Akun Screen
            }) {
                MenuItem(iconId = R.drawable.ic_verification, label = "Verifikasi Akun")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Tentang Kami") // Navigate to Tentang Kami Screen
            }) {
                MenuItem(iconId = R.drawable.ic_about_us, label = "Tentang Kami")
            }
            Row(modifier = Modifier.clickable {
                // Navigate Keluar App
            }) {
                MenuItem(iconId = R.drawable.ic_logout, label = "Keluar")
            }
        }
    }
}

@Composable
fun NavSetting() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "settings") {
        composable("Settings") { SettingsMenu(navController) }
        composable("Profile") { ProfileScreen(navController) }
        composable("Kontrakan Saya") { KontrakSayaScreen(navController) }
        composable("Riwayat Pengajuan Sewa") { RiwayatPengajuan(navController) }
        composable("Riwayat Transaksi") { RiwayatTransaksi(navController) }
        composable("Verifikasi Akun") { VerifikasiAkun(navController) }
        composable("Tentang Kami") { TentangKami(navController) }
        composable("Edit") { ProfileSetting(navController) }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewSettingsMenu()
{
    NavSetting()
}