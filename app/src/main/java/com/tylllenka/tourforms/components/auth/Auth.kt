package com.tylllenka.tourforms.components.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tylllenka.tourforms.R
import com.tylllenka.tourforms.components.auth.buttons.ButtonLogin
import com.tylllenka.tourforms.components.auth.inputs.Email
import com.tylllenka.tourforms.components.auth.inputs.Password

@Composable
fun Auth() {
    val isEmail = remember { mutableStateOf(false) }
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Box(Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "background",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column(
            Modifier
                .padding(horizontal = 25.dp)
                .fillMaxSize()
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "")
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Authorization",
                    color = Color.White,
                    modifier = Modifier.padding(bottom = 20.dp),
                    fontSize = 24.sp
                )
                Email(email = email, emailValidate = isEmail)
                Password(state = password, placeholder = "Password")
                ButtonLogin(isEmailValidate = isEmail)
            }
            Registration()
        }
    }
}