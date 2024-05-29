package com.example.kontrakinmobile.presentation.homeScreen.components

import android.widget.RatingBar
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.StarHalf
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.StarOutline
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.StarHalf
import androidx.compose.material.icons.rounded.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.kontrakinmobile.R

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 0.0,
    stars: Int = 5,
    filledStarColor : Color = Color.Yellow,
    unfilledStarColor: Color = Color.Gray,
    onRatingChanges: (Double) -> Unit
) {

    var isHalfStar = (rating % 1) != 0.0

    Row {
        for (index in 1..stars) {
            val starValue = when {
                index <=  rating  -> 1.0
                index.toDouble() == rating + 0.5 -> 0.5
                else -> 0.0
            }
            Icon(
                contentDescription = null,
                tint = if (starValue > 0.0) filledStarColor else unfilledStarColor ,
                imageVector = when (starValue) {
                    1.0 -> Icons.Rounded.Star
                    0.5 -> Icons.AutoMirrored.Rounded.StarHalf
                    else -> Icons.Rounded.StarOutline
                }
            )

        }
    }
}