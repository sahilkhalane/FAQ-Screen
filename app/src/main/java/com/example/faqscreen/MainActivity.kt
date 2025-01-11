package com.example.faqscreen

import android.R.attr.top
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.faqscreen.ui.theme.FAQScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FAQScreenTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column (
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.faqbg), contentDescription = "FAQ",
            modifier = Modifier.size(180.dp).padding(bottom = 10.dp))
        Text(
            text = "1.What happens if I enter the wrong OTP during account verification?",
            color = Color.Blue,
            fontSize = 18.sp,
            modifier = Modifier.run { padding(vertical = 2.dp, horizontal= 16.dp) }

        )
        Text(
            text = "If you enter the wrong OTP, you will be shown an error message and will have to re-enter the correct code. Please enter the correct OTP that your receive on your registered mobile number via SMS to proceed with verification process successfully.",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 4.dp, horizontal = 16.dp)
        )

        Text(
            text = "2.Where can I contact if I face any issues while booking a hotel room using the app?",
            color = Color.Blue,
            fontSize = 18.sp,
            modifier = Modifier.padding(vertical = 20.dp, horizontal = 16.dp))

        Text(
            text = "If you face any Issues during your booking process you can contact to our customer support team by at dummy@booknest.com or call us at 9999999999.",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
        )


        Text(
            text = "3.Is my personal information secure when using this app?",
            color = Color.Blue,
            fontSize = 18.sp,
            modifier = Modifier.padding(vertical= 20.dp, horizontal = 20.dp))



        Text(
            text = "Yes we value the trust of our users and prioritise the security of their personal information. All your data, including personal details and booking information is secure within us and protected using encryption protocols to insure confidentiality.",
            color = Color.Black,
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 0.2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FAQScreenTheme {
        Greeting("Android")
    }
}