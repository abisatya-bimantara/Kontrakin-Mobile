package com.example.kontrakinmobile.presentation.RegisterScreen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.LoginScreen.components.OtherAuthFeatureIcon
import com.example.kontrakinmobile.presentation.LoginScreen.components.OtherAuthFeatureImage
import com.example.kontrakinmobile.presentation.LoginScreen.isValidPassword
import com.example.kontrakinmobile.presentation.RegisterScreen.components.DaftarButton
import com.example.kontrakinmobile.presentation.RegisterScreen.components.EmailFieldComponents
import com.example.kontrakinmobile.presentation.RegisterScreen.components.KebijakanComponents
import com.example.kontrakinmobile.presentation.RegisterScreen.components.NumberFieldComponents
import com.example.kontrakinmobile.presentation.RegisterScreen.components.PasswordFieldComponents
import com.example.kontrakinmobile.presentation.RegisterScreen.components.SudahDaftarText
import com.example.kontrakinmobile.presentation.RegisterScreen.components.TextFieldComponents

@Composable
fun RegisterScreen(modifier: Modifier = Modifier) {
    var password by remember { mutableStateOf("") }
    var passwordError by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth()
    ) {
        Spacer(modifier = modifier.height(100.dp))
        Text(
            text = "Daftar Sebagai Pencari",
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 22.sp
        )
        Spacer(modifier = modifier.height(24.dp))
        TextFieldComponents(nama = "Nama")
        Spacer(modifier = modifier.height(8.dp))
        EmailFieldComponents(label = "Email")
        Spacer(modifier = modifier.height(8.dp))
        NumberFieldComponents(label = "Nomor Telepon")
        Spacer(modifier = modifier.height(8.dp))
        TextFieldComponents(nama = "Alamat")
        Spacer(modifier = modifier.height(8.dp))
        PasswordFieldComponents(
            value = password,
            onValueChange = {
                password = it
                passwordError = !isValidPassword(it)
                            },
            isError = passwordError
        )
        Spacer(modifier = modifier.height(12.dp))
        KebijakanComponents()
        Spacer(modifier = modifier.height(24.dp))
        DaftarButton()
        Spacer(modifier = modifier.height(12.dp))
        SudahDaftarText()
        Spacer(modifier = modifier.height(36.dp))
        Text(
            text = "Atau daftar dengan",
            modifier = modifier.align(Alignment.CenterHorizontally),
            fontSize = 12.sp
        )
        Spacer(modifier = modifier.height(24.dp))
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OtherAuthFeatureIcon()
            OtherAuthFeatureImage(icon = R.drawable.icons8_google)
            OtherAuthFeatureImage(icon = R.drawable.icons8_apple)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RegisterScreenPreview() {
    RegisterScreen()
}