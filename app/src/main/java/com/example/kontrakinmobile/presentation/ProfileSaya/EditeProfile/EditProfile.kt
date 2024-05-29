package com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.components.ButtonEditeProfile
import com.example.kontrakinmobile.presentation.ProfileSaya.EditeProfile.components.ContentProfileEdit
import com.example.kontrakinmobile.presentation.ProfileSaya.components.HeaderProfile

@Composable
fun ProfileSetting(navController: NavHostController) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFD6E8E8))
    ){
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Row (modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    Text(
                        modifier = Modifier,
                        text = "Edit Profile",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            HeaderProfile()
            Spacer(modifier = Modifier.height(30.dp))
            ContentProfileEdit()
            ButtonEditeProfile(navController)
        }
    }

}
@Preview (showBackground = true)
@Composable
fun ProfileSettingPreviw() {
    ProfileSetting(rememberNavController())
}