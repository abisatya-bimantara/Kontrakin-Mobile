package com.example.kontrakinmobile.presentation.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.LoginScreen.components.EmailFieldComponents
import com.example.kontrakinmobile.presentation.LoginScreen.components.PasswordFieldComponents

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = 24.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Masuk sebagai pencari", fontWeight = FontWeight.Bold)
        Image(
            painter = painterResource(id = R.drawable.logo_kontrakin_1),
            contentDescription = null
        )
        EmailFieldComponents(label = "Email", placeholder = "johndoe@gmail.com")
        PasswordFieldComponents(label = "Password", placeholder = "********")
    }
}


@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}