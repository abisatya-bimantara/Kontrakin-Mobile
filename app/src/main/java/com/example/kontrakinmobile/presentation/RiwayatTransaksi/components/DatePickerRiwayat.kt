package com.example.kontrakinmobile.presentation.RiwayatTransaksi.components

import android.app.DatePickerDialog
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.Calendar

@Composable
fun ShowDatePicker(){

    val c = Calendar.getInstance()
    val year = c.get(Calendar.YEAR)
    val month = c.get(Calendar.MONTH)
    val day = c.get(Calendar.DAY_OF_MONTH)

    val context = LocalContext.current

    var date by remember {
        mutableStateOf("")
    }

    val datePickerDialog = DatePickerDialog(
        context,{ year1, month1, day1, d ->
            val month2 = month1 + 1
            date = "$day1 - $month2 - $year1"
        }, year, month, day
    )


    Row (modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Column {
            Text(text = "Dari", modifier = Modifier.padding(start = 15.dp))
            OutlinedTextField(
                modifier = Modifier
                    .width(175.dp)
                    .height(50.dp)
                    .clickable { datePickerDialog.show()},
                value = "Selected: $date",
                singleLine = true,
                enabled = false,
                onValueChange = {},
                textStyle = LocalTextStyle.current.copy(
                    textAlign = TextAlign.Start,
                    fontSize = 15.sp
                ),
                shape = RoundedCornerShape(15.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = 5.dp),
                        tint = Color.hsv(
                            hue = 171f,
                            saturation = 0.36f,
                            value = 0.50f,
                            alpha = 1f
                        )
                    )
                }

            )
        }
        Spacer(modifier = Modifier.width(10.dp))
    Column{
        Text(text = "Sampai",modifier = Modifier.padding(start = 15.dp))
        OutlinedTextField(
            modifier = Modifier
                .width(175.dp)
                .height(50.dp)
                .clickable {datePickerDialog.show()},
            value = "Selected: $date",
            onValueChange = {},
            enabled = false,
            singleLine = true,
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Start, fontSize = 15.sp),
            shape = RoundedCornerShape(15.dp),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.DateRange,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 5.dp),
                    tint = Color.hsv(
                        hue = 171f,
                        saturation = 0.36f,
                        value = 0.50f,
                        alpha = 1f
                    )
                )
            }
        )
        }
    }
}
@Preview (showBackground = true)
@Composable
fun PreviewDatePicker() {
    ShowDatePicker()
}