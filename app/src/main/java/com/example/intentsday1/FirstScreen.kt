package com.example.intentsday1

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {
    val context = LocalContext.current  // Get the current context

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Explicit Intent: Navigate to Second Screen with Data
        Button(onClick = {
            navController.navigate("second_screen/Hello from First Screen!")
        }) {
            Text("Go to Second Screen (Explicit Intent)")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Implicit Intent: Open Google in Browser
        Button(onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            context.startActivity(intent)
        }) {
            Text("Open Google (Implicit Intent)")
        }

        Spacer(modifier = Modifier.height(20.dp))


        // Implicit Intent: Open Dialer in System
        Button(onClick = {
            navController.navigate("open")
        }) {
            Text("Open Dialer (Implicit Intent)")
        }


    }
}
