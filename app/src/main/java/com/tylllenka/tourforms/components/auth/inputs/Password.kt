package com.tylllenka.tourforms.components.auth.inputs

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import com.tylllenka.tourforms.R

@Composable
fun Password(
    state: MutableState<String>,
    placeholder: String
) {
    TextField(
        value = state.value,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF262626),
            textColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            leadingIconColor = Color(0xFFCCD2E3)
        ),
        modifier = Modifier.fillMaxWidth().size(55.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        shape = RoundedCornerShape(15.dp),
        onValueChange = { if (!it.contains("\n")) state.value = it },
        placeholder = { Text(text = placeholder, color = Color(0xFF878787)) },
        visualTransformation = PasswordVisualTransformation(mask = '●'),
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.lock),
                contentDescription = "leadingIcon",
                modifier = Modifier.padding(start = 15.dp, end = 8.dp)
            )
        }
    )
}