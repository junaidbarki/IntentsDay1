package com.example.intentsday1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "first_screen") {

                composable("first_screen") { FirstScreen(navController)

                }
                composable("second_screen/{message}")
                { backStackEntry ->
                    val message = backStackEntry.arguments?.getString("message")
                    SecondScreen(navController, message ?: "No Data")
                }
                composable("open"){
                    OpenDialer(navController)
                }
            }
        }
    }
}