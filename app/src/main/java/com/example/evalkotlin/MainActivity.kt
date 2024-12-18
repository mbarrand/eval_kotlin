package com.example.evalkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.evalkotlin.data.repository.CharacterRepository
import com.example.evalkotlin.navigation.NavigationGraph
import com.example.evalkotlin.ui.theme.EvalKotlinTheme

class MainActivity : ComponentActivity() {

    private val characters = CharacterRepository.getMockedCharacters()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvalKotlinTheme {
                val navController = rememberNavController()
                // Utilisation de NavigationGraph pour gérer la navigation
                NavigationGraph(navController = navController, characters = characters)
            }
        }
    }
}
