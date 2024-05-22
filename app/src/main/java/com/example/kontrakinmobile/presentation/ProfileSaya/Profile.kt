package com.example.kontrakinmobile.presentation.ProfileSaya

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R


@Composable
fun ProfileScreen() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFD6E8E8)),
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Card(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            colors = CardDefaults.cardColors(Color.White)

        ){
            Row(
                modifier = Modifier
                .fillMaxWidth()
                .padding(start = 19.dp, end = 19.dp, top = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { /* Handle menu item click */ },
                    tint = Color.hsv(
                        hue = 170f,
                        saturation = 0.36f,
                        value = 0.75f,
                        alpha = 1f
                    )
                )
                Text(
                    modifier = Modifier.padding(start = 10.dp)
                        .offset( x = 110.dp),
                    text = "Profile",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            }
            HeaderProfile()
            Spacer(modifier = Modifier.height(30.dp))
            ContentProfile()
            ButtonProfile()
        }
    }
}

@Preview(widthDp = 393, heightDp = 830)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

@Composable
fun HeaderProfile() {
    Column (
        Modifier
            .fillMaxWidth()
            .padding(top = 30.dp)) {
        Image(
            painter = painterResource(id = R.drawable.pic_profile),
            contentDescription = "Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .border(2.dp, Color.White, CircleShape)
                .clip(CircleShape)
                .shadow(8.dp)
                .align(Alignment.CenterHorizontally)

        )
        Text(text = "Hi, Clinton", modifier = Modifier.align(Alignment.CenterHorizontally))
        Text(text = "Karyawan", modifier = Modifier.align(Alignment.CenterHorizontally))
    }
}
@Composable
fun ContentProfile() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        ProfileField(label = "Nama Lengkap", value = "Clinton Lombogia")
        ProfileField(label = "Jenis Kelamin", value = "Laki-laki")
        ProfileField(label = "Tanggal Lahir", value = "31/08/2004")
        ProfileField(label = "Pekerjaan", value = "Mahasiswa")
        ProfileField(label = "Kota Asal", value = "Manado")
        ProfileField(label = "Status", value = "Pelajar")
        ProfileField(label = "No Kontak Darurat", value = "+62895120000")
    }
}
@Composable
fun ButtonProfile(){
    Column (modifier = Modifier.fillMaxWidth()) {
        Button(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp),
            colors = ButtonDefaults.buttonColors(Color(0xff7BC0B5)),
            onClick = { /*TODO*/ },
        ) {
            Text(text = "Edit Profile")

        }
    }
}

@Composable
fun ProfileField(label: String, value: String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 19.dp, end = 19.dp, bottom = 20.dp),
        horizontalArrangement = (Arrangement.SpaceBetween)
        ) {
        Text(
            text = label,
            fontSize = 15.sp,
            color = Color.Gray,
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
        OutlinedTextField(
            modifier = Modifier
                .width(186.dp)
                .height(50.dp),
            readOnly = true,
            value = value,
            onValueChange = {},
            enabled = false,
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, fontSize = 15.sp),
            shape = RoundedCornerShape(15.dp),

        )
    }
}
