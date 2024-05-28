package com.example.kontrakinmobile.presentation.ProfileSaya.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@Composable
fun HeaderProfile() {
    Column (
        Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)) {
        Image(
            painter = painterResource(id = R.drawable.pic_profile),
            contentDescription = "Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .border(2.dp, Color.White, CircleShape)
                .clip(CircleShape)
                .shadow(8.dp)
                .align(Alignment.CenterHorizontally)

        )
        Text(text = "Hi, Clinton", modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Karyawan", modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}