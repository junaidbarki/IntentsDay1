package com.example.intentsday1

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, message: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("This is Second Screen")
        Spacer(modifier = Modifier.height(10.dp))
        Text("Received Message: $message")

        Spacer(modifier = Modifier.height(20.dp))

        // Go back button
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Go Back to First Screen")
        }
    }
}
