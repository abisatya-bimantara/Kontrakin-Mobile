package com.example.kontrakinmobile.presentation.homeScreen.components

import android.media.Rating
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kontrakinmobile.R

@Composable
fun ItemComponents(
    modifier: Modifier = Modifier,
    image: Int,
    namaKontrakan: String,
    namaKecamatan: String,
    rating: Double

    ) {

    var rating by remember { mutableStateOf(rating) }


    var selected by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier.padding(horizontal = 12.dp)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Kontrakan",
            modifier = modifier.clip(RoundedCornerShape(20.dp))
                .size(width = 620.dp, height = 250.dp),
            alignment = Alignment.Center
        )
        Spacer(modifier = modifier.height(12.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = namaKontrakan,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 14.sp
                )
                Spacer(modifier = modifier.height(4.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RatingBar(
                        rating = rating,

                        ) {
                        rating = it
                    }
                    Spacer(modifier = modifier.width(12.dp))
                    Text(text = "Kec. $namaKecamatan")
                }
            }
            IconToggleButton(
                checked = selected,
                onCheckedChange = {
                    selected = !selected
                },

            ) {
                Icon(
                    imageVector = if (selected) {
                                                Icons.Filled.Favorite
                                                } else {
                                                       Icons.Filled.FavoriteBorder
                                                       },
                    contentDescription = null,
                    tint = if (selected) Color(0xFFe31b23) else Color.Black
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun ItemComponentsPreview() {
    ItemComponents(image = R.drawable.kontrakan_1, namaKontrakan = "Kontrakan Permai", namaKecamatan = "Talawaan", rating = 4.5)
}