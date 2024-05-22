package com.example.kontrakinmobile.presentation.loginRegister.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R

@Composable
fun LoginRegisterPage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_kontrakin),
            contentDescription = null,
            modifier = modifier
                .size(400.dp)
                .align(Alignment.TopCenter)
        )
        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(90.dp)
                .align(Alignment.BottomCenter),
            colors = CardDefaults.cardColors(Color(0xFF7BC0B5)),
            shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(top = 22.dp, start = 16.dp, end = 16.dp)
                    .fillMaxWidth()
            ) {
                ElevatedButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier
                        .width(180.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Register", color = Color(0xFF7BC0B5))
                }

                ElevatedButton(
                    onClick = { /*TODO*/ },
                    modifier = modifier
                        .width(180.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Login", color = Color(0xFF7BC0B5))
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 412, heightDp = 915 )
@Composable
private fun LoginRegisterPagePreview() {
    LoginRegisterPage()
}