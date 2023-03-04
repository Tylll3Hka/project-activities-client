package com.tylllenka.tourforms.components.auth.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Registration() {
    Button(
        onClick = { /* TODO() */ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp)
            .size(55.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF262626)),
        elevation = null,
    ) {
        Text(
            text = "Registration",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight(400)
        )
    }
}