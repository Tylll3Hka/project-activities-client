package com.tylllenka.tourforms.components.auth.inputs

import android.text.TextUtils
import android.util.Patterns
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
import androidx.compose.ui.unit.dp
import com.tylllenka.tourforms.R

@Composable
fun Email(email: MutableState<String>, emailValidate: MutableState<Boolean>) {
    TextField(
        value = email.value,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color(0xFF262626),
            textColor = Color.White,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            leadingIconColor = Color(0xFFCCD2E3),
            trailingIconColor = if (emailValidate.value) Color.Green else Color(0xFFFF4848)
        ),
        modifier = Modifier.fillMaxWidth().padding(bottom = 15.dp).size(55.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        shape = RoundedCornerShape(15.dp),
        maxLines = 1,
        onValueChange = {
            if (!it.contains("\n")) email.value = it
            it.isValidateEmail(emailValidate)
        },
        placeholder = {
            Text(
                text = "Email",
                color = Color(0xFF878787)
            )
        },
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.user),
                contentDescription = "email",
                modifier = Modifier.padding(start = 15.dp, end = 8.dp)
            )
        },
        trailingIcon = {
            if(!emailValidate.value && (email.value != "")) {
                Icon(
                    painter = painterResource(R.drawable.cross),
                    contentDescription = "err",
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(27.dp)
                )
            } else if (email.value != "") {
                Icon(
                    painter = painterResource(R.drawable.check_mark),
                    contentDescription = "err",
                    modifier = Modifier
                        .padding(end = 15.dp)
                        .size(27.dp)
                )
            }
        }
    )
}

fun String.isValidateEmail(emailValidate: MutableState<Boolean>) {
    emailValidate.value = !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}