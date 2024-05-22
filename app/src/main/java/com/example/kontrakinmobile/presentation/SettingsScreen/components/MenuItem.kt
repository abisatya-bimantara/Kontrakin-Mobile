package com.example.kontrakinmobile.presentation.SettingsScreen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun MenuItem(iconId: Int, label: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp)
            .padding(horizontal = 30.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = Color.hsv(
                hue = 171f,
                saturation = 0.36f,
                value = 0.50f,
                alpha = 1f
            )
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            label,
            fontSize = 16.sp,
            color = Color.hsv(
                hue = 171f,
                saturation = 0.36f,
                value = 0.50f,
                alpha = 1f
            )
        )

    }
}
@Preview (showBackground = true)
@Composable
fun PreviewMenuItem ()
{
    MenuItem(iconId = R.drawable.ic_profile, label = "Profile Saya")
}