package com.example.kontrakinmobile.presentation.onboarding_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF89D5C9))
    ) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = page.title,
            modifier = modifier
                .fillMaxWidth()
                .weight(1f), // Let the image take up remaining space // Experiment with scaling
        )

        Card(
            modifier = modifier
                .fillMaxWidth()
                .height(400.dp),
            shape = RoundedCornerShape(topStart = 120.dp),
            colors = CardDefaults.cardColors(Color.White),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, // Center the text
                modifier = modifier.padding(start = 30.dp, top = 50.dp, end = 12.dp)
            ) {
                Text(
                    text = page.title,
                    fontSize = 20.sp,
                    color = Color(0xFF63D3C7),
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.End
                )
                Spacer(modifier = modifier.height(12.dp))
                Text(
                    text = page.description,
                    fontSize = 16.sp,
                    textAlign = TextAlign.End,
                )
            }
        }
    }
}

@Preview(widthDp = 412, heightDp = 915)
@Composable
fun OnBoardingPagePreview() {
    OnBoardingPage(
        page = Page(
            title = "Aplikasi Pencari Kontrakan Rumah Impian Anda, Sekarang Dalam Genggaman.",
            description = "Cari Kontrakan yang akurat dan tepercaya kini semakin mudah. Membantu masyarakat untuk lebih mudah mencari kontrakan layak huni",
            image = R.drawable.house_element
        )
    )
}
