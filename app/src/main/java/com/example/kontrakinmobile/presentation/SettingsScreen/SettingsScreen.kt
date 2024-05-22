package com.example.kontrakinmobile.presentation.SettingsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import com.example.kontrakinmobile.presentation.ProfileSaya.ProfileScreen
import com.example.kontrakinmobile.presentation.RiwayatPengajuan.RiwayatPengajuan
import com.example.kontrakinmobile.presentation.RiwayatTransaksi.RiwayatTransaksi
import com.example.kontrakinmobile.presentation.SettingsScreen.components.Header
import com.example.kontrakinmobile.presentation.SettingsScreen.components.MenuItem
import com.example.kontrakinmobile.presentation.SettingsScreen.components.SettingsMenu
import com.example.kontrakinmobile.presentation.TentangKami.TentangKami
import com.example.kontrakinmobile.presentation.VerifikasiAkun.VerifikasiAkun

@Composable
fun SettingsScreen() {
    Column (modifier = Modifier.background(color=Color(0xffDAF2EE))) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        SettingsMenu()
    }
}

@Preview(showBackground = true)
@Composable
fun SettingsScreenPreview() {
    SettingsScreen()
}


@Composable
fun SettingsScreen2(navController: NavHostController) {
        Column ()
        {
            Row(modifier = Modifier.clickable {
                navController.navigate("profile Saya") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_profile, label = "Profile Saya")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("kontrakan Saya") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_home, label = "Kontrakan Saya")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Riwayat Pengajuan Sewa") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_history, label = "Riwayat Pengajuan Sewa")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Riwayat Transaksi") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_transaction, label = "Riwayat Transaksi")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Verifikasi Akun") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_verification, label = "Verifikasi Akun")
            }
            Row(modifier = Modifier.clickable {
                navController.navigate("Tentang Kami") // Navigate to Profile Screen
            }) {
                MenuItem(iconId = R.drawable.ic_about_us, label = "Tentang Kami")
            }
        }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "settings") {
        composable("settings") { SettingsScreen2(navController) }
        composable("profile Saya") { ProfileScreen() }
        composable("Kontrakan Saya") { KontrakSayaScreen() }
        composable("Riwayat Pengajuan Sewa") { RiwayatPengajuan() }
        composable("Riwayat Transaksi") { RiwayatTransaksi() }
        composable("Verifikasi Akun") { VerifikasiAkun() }
        composable("Tentang Kami") { TentangKami() }
    }
}
@Preview (showBackground = true)
@Composable
fun MyAppPreview() {
    MyApp()
}