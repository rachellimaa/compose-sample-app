package com.rachellimaa.composeapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rachellimaa.composeapp.ui.theme.ComposeAppTheme
import com.rachellimaa.composeapp.ui.theme.LatoFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppTheme {

            }
        }
    }
}

@Composable
fun CustomText(@StringRes textResId: Int) {
    Text(
        text = stringResource(id = textResId),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable {
                Log.d("XX", "Test click")
            },
        color = Color.Red,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        style= MaterialTheme.typography.body1,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {
        CustomText(textResId = R.string.welcome)
    }
}