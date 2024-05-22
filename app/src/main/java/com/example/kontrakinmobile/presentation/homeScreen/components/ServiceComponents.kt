package com.example.kontrakinmobile.presentation.homeScreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceComponents(modifier: Modifier = Modifier) {
    Row (
        modifier = modifier.fillMaxWidth().padding(horizontal = 64.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CardComponent(text = "PDAM", image = R.drawable.filled)
        CardComponent(text = "PLN", image = R.drawable.pln)
        CardComponent(text = "Jangkut", image = R.drawable.truck_fast)
    }
}