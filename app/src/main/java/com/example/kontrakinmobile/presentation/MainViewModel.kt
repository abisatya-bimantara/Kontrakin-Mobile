package com.example.kontrakinmobile.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kontrakinmobile.data.datastore.MyPreferencesDataStore
import com.example.kontrakinmobile.navigation.Screen
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val myPreferencesDataStore: MyPreferencesDataStore
): ViewModel() {
    var isLoading by mutableStateOf(true)
        private set

    var startDestination by mutableStateOf(Screen.OnBoardScreen.name)
        private set

    init {
        myPreferencesDataStore.readAppEntry.onEach { loadOnBoardingScreen ->
            startDestination = if (loadOnBoardingScreen) {
                Screen.OnBoardScreen.name
            } else {
                Screen.HomeScreen.name
            }
            delay(300)
            isLoading = false
        }.launchIn(viewModelScope)
    }

    fun saveAppEntry() {
        viewModelScope.launch {
            myPreferencesDataStore.saveAppEntry()
        }
    }
}