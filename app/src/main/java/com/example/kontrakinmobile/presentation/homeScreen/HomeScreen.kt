package com.example.kontrakinmobile.presentation.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.R
import com.example.kontrakinmobile.presentation.homeScreen.components.ItemComponents
import com.example.kontrakinmobile.presentation.homeScreen.components.ItemList
import com.example.kontrakinmobile.presentation.homeScreen.components.SearchComponents
import com.example.kontrakinmobile.presentation.homeScreen.components.ServiceComponents

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)

    ) {
        SearchComponents()
        Spacer(modifier = modifier.height(24.dp))
        Image(
            painter = painterResource(id = R.drawable.house_search),
            contentDescription = "home image",
            modifier = modifier
                .size(height = 350.dp, width = 350.dp)
                .align(Alignment.CenterHorizontally)
        )
        ServiceComponents()
        Spacer(modifier = modifier.height(48.dp))
        Text(
            text = "Terdekat",
            modifier = modifier.padding(horizontal = 24.dp),
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = modifier.height(20.dp))
        ItemList()

    }
}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}
