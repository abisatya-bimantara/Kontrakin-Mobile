package com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ButtonEditeProfile(navController: NavHostController) {
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { navController.navigate("Profile")},
        ) {
            Text(text = "Batal")
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Button(
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = {},
        ) {
            Text(text = "Simpan")
        }
    }
}


@Preview(showBackground =true)
@Composable
fun ButtonEditeProfilePreview() {
    ButtonEditeProfile(rememberNavController())
}