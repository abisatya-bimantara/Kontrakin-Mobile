package com.example.kontrakinmobile.presentation.VerifikasiAkun.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun JenisIdentitas() {
    val items = listOf("E- KTP", "SIM", "Passport")
    val checkedState = remember { mutableStateMapOf<String, Boolean>().withDefault { false } }

    Column {
        items.forEach { item ->
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(
                    checked = checkedState.getValue(item),
                    onCheckedChange = { checkedState[item] = it },
                    colors = CheckboxDefaults.colors(Color(0xff7BC0B5))
                )
                Text(text = item)
            }
        }
    }
}
@Preview (showBackground = true)
@Composable
fun PreviewjenisIdentitas(){
    JenisIdentitas()
}