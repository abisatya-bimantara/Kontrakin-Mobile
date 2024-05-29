package com.example.kontrakinmobile.presentation.VerifikasiAkun.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun  Menyetujui() {
    val checkedState = remember {
        mutableStateOf(false)
    }
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
            colors = CheckboxDefaults.colors(Color(0xff7BC0B5)))
        Column {
        Text(text = "Dengan melanjutkan, saya menjamin data yang diberikan adalah benar dan menyetujui ")
        Text(
            text = "privasi",
            modifier = Modifier.clickable{},
            color = Color(0xff298F8F),
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMenyetujui(){
    Menyetujui()
}