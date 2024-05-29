package com.example.kontrakinmobile.presentation.onboarding_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun PageIndicator(
    pageSize: Int,
    selectedPage: Int,
    modifier : Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        repeat(pageSize) { page ->
            Box(modifier = Modifier
                .padding(horizontal = 4.dp)
                .size(20.dp)
                .clip(CircleShape)
                .background(
                    color = if (page == selectedPage) Color(0xFF89D5C9) else Color.LightGray
                )
            )
        }
    }
}