package com.example.kontrakinmobile.presentation.LoginScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Facebook
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.LoginScreen.components.BelumDaftarText
import com.example.kontrakinmobile.presentation.LoginScreen.components.EmailFieldComponents
import com.example.kontrakinmobile.presentation.LoginScreen.components.MasukButton
import com.example.kontrakinmobile.presentation.LoginScreen.components.OtherAuthFeatureIcon
import com.example.kontrakinmobile.presentation.LoginScreen.components.OtherAuthFeatureImage
import com.example.kontrakinmobile.presentation.LoginScreen.components.PasswordFieldComponents
import com.example.kontrakinmobile.presentation.LoginScreen.components.RememberMeComponents

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    var checkedState = remember { mutableStateOf(false) }

    Column(
        modifier = modifier
            .padding(horizontal = 24.dp)
            .fillMaxWidth(),
    ) {
        Text(text = "Masuk sebagai pencari", fontWeight = FontWeight.Bold, modifier = modifier.align(Alignment.CenterHorizontally))
        Image(
            painter = painterResource(id = R.drawable.logo_kontrakin_1),
            contentDescription = null,
            modifier = modifier.align(Alignment.CenterHorizontally)
        )
        EmailFieldComponents(label = "Email", placeholder = "example@gmail.com")
        PasswordFieldComponents(label = "Password", placeholder = "********")
        Spacer(modifier = modifier.height(18.dp))
        MasukButton()
        Spacer(modifier = modifier.height(12.dp))
        BelumDaftarText()
        Spacer(modifier = modifier.height(18.dp))
        Text(
            text = "Atau daftar dengan",
            modifier = modifier.align(Alignment.CenterHorizontally),
            fontSize = 12.sp
        )
        Spacer(modifier = modifier.height(12.dp))
        Row(
            modifier = modifier.fillMaxWidth().align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            OtherAuthFeatureIcon()
            OtherAuthFeatureImage(icon = R.drawable.icons8_google)
            OtherAuthFeatureImage(icon = R.drawable.icons8_apple)
        }


    }
}


@Preview(showBackground = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}