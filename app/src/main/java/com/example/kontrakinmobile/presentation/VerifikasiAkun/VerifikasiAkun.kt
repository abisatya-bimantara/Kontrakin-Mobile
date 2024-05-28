package com.example.kontrakinmobile.presentation.VerifikasiAkun

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kontrakinmobile.presentation.SettingsScreen.SettingsScreen
import com.example.kontrakinmobile.presentation.SettingsScreen.components.Header
import com.example.kontrakinmobile.presentation.SettingsScreen.components.SettingsMenu
import com.example.kontrakinmobile.presentation.TentangKami.TentangKami
import com.example.kontrakinmobile.presentation.VerifikasiAkun.components.ContentVerifikasiAkun


@Composable
fun VerifikasiAkun(navController: NavHostController) {
    Column (modifier = Modifier.background(color = Color(0xffDAF2EE))) {
        Header()
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {navController.popBackStack()},
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f
                    )
                )
                Row (modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Text(
                        modifier = Modifier.padding(end = 32.dp),
                        text = "Verifikasi Akun",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
                ContentVerifikasiAkun()
        }
    }
}
@Preview
@Composable
fun PreviewVerifikasiAkun() {
    VerifikasiAkun(navController = rememberNavController())
}