package com.example.kontrakinmobile.presentation.ProfileSaya.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.ProfileSetting
import com.example.kontrakinmobile.presentation.ProfileSaya.ProfileScreen
import com.example.kontrakinmobile.presentation.SettingsScreen.components.NavSetting

@Composable
fun ButtonProfile(navController: NavHostController){
    Column (modifier = Modifier.fillMaxWidth()) {
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { navController.navigate("Edit")},
        ) {
            Text(text = "Edit Profile")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ButtonProfile(rememberNavController())
}