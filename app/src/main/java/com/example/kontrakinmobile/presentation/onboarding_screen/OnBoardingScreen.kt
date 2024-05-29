package com.example.kontrakinmobile.presentation.onboarding_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.kontrakinmobile.presentation.MainViewModel
import com.example.kontrakinmobile.presentation.onboarding_screen.components.NextBackButton
import com.example.kontrakinmobile.presentation.onboarding_screen.components.OnBoardingPage
import com.example.kontrakinmobile.presentation.onboarding_screen.components.PageIndicator
import com.example.kontrakinmobile.presentation.onboarding_screen.components.pages
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingScreen(mainViewModel: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.White)
    ) {
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }
        val currentPage = pagerState.currentPage
        val scope: CoroutineScope = rememberCoroutineScope()

        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxWidth().weight(1f)) {position ->
            OnBoardingPage(page = pages[position])
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 12.dp)
                .background(color = Color.White),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            PageIndicator(
                pageSize = pages.size,
                selectedPage = currentPage,
            )
            NextBackButton(
                currentPage = currentPage ,
                onNextClick = {
                              scope.launch {
                                  pagerState.animateScrollToPage(currentPage + 1)
                                }
                              },
                onBackClick = {
                              scope.launch {
                                  pagerState.animateScrollToPage(currentPage - 1)
                              }
                },
                onGetStartedClick = { mainViewModel.saveAppEntry() }
            )
        }
    }
}