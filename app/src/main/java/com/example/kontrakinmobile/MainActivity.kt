package com.example.kontrakinmobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kontrakinmobile.presentation.MainViewModel
import com.example.kontrakinmobile.navigation.AppNavigation
import com.example.kontrakinmobile.ui.theme.KontrakinMobileTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen().setKeepOnScreenCondition {
            mainViewModel.isLoading
        }
        setContent {
            KontrakinMobileTheme {
                AppNavigation(
                    startDestination = mainViewModel.startDestination,
                    mainViewModel = mainViewModel
                )
            }
        }
    }
}
