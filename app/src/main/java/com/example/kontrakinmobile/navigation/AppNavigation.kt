package com.example.kontrakinmobile.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kontrakinmobile.presentation.LoginScreen.LoginScreen
import com.example.kontrakinmobile.presentation.MainViewModel
import com.example.kontrakinmobile.presentation.RegisterScreen.RegisterScreen
import com.example.kontrakinmobile.presentation.homeScreen.HomeScreen
import com.example.kontrakinmobile.presentation.loginRegister.LoginRegisterScreen
import com.example.kontrakinmobile.presentation.onboarding_screen.OnBoardingScreen

@Composable
fun AppNavigation(
    startDestination: String,
    mainViewModel: MainViewModel,
) {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.OnBoardScreen.name) {
            OnBoardingScreen(mainViewModel = mainViewModel)
        }
        composable(route = Screen.HomeScreen.name) {
            HomeScreen()
        }
    }
}