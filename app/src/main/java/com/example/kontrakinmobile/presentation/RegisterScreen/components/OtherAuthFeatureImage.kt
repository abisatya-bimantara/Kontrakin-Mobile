package com.example.kontrakinmobile.presentation.RegisterScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OtherAuthFeatureImage(modifier: Modifier = Modifier, icon: Int) {
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
            Image(
                painter = painterResource(id = icon),
                contentDescription = null,
                modifier = modifier.size(20.dp)
            )
        }
    }
}


@Preview
@Composable
private fun OtherAuthFeaturePreview() {
    OtherAuthFeatureImage(icon = R.drawable.icons8_google)
}