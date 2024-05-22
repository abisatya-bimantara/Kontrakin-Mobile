package com.example.kontrakinmobile.presentation.SettingsScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun Header() {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = painterResource(id = R.drawable.pic_profile),
            contentDescription = "Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .border(2.dp, Color.White, CircleShape)
                .clip(CircleShape)
                .shadow(8.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(
                text = "Hi,Clinton",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row {
                Text(text = "Pengguna")
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier
                        .clickable { /* Handle menu item click */ },
                )
            }

        }
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = null,
            modifier = Modifier
                .size(30.dp)
                .clickable { /* Handle menu item click */ },
            tint = Color.hsv(
                hue = 170f,
                saturation = 0.36f,
                value = 0.75f,
                alpha = 1f
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeader() {
    Header()
}