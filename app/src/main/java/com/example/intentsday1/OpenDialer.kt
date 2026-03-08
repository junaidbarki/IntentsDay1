package com.example.intentsday1

import android.content.Intent
import android.net.Uri
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController

@Composable
fun OpenDialer(navController: NavController) {
    val context = LocalContext.current
    Button(onClick = {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:+123456789"))
        context.startActivity(intent)
    }) {
        Text("Call +123456789")
    }
}
