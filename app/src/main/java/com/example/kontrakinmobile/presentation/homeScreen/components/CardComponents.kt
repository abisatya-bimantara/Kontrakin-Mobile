package com.example.kontrakinmobile.presentation.homeScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardComponent(modifier: Modifier = Modifier, text: String, image: Int) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            onClick = { },
            modifier = modifier
                .size(60.dp),
            colors = CardDefaults.cardColors(Color(0xFF7BC0B5)),


            ) {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "water_drop",
                    modifier = modifier.size(30.dp)
                )
            }
        }
        Text(text = text, fontSize = 16.sp, textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
private fun CardComponentPreview() {
    CardComponent(text = "PDAM", image = R.drawable.water_drop)
}