package com.example.kontrakinmobile.presentation.RegisterScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherAuthFeatureIcon(modifier: Modifier = Modifier) {
    OutlinedCard(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
            .size(75.dp, 55.dp)
    ) {
        Box(
            modifier = modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.Facebook,
                contentDescription = null,
                tint = Color(0xFF1877F2)
            )
        }
    }
}


@Preview
@Composable
private fun OtherAuthFeatureIconPreview() {
    OtherAuthFeatureIcon()
}