package com.example.a044_projectakhir.ui.halaman

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a044_projectakhir.R
import com.example.a044_projectakhir.ui.theme._044_ProjectAkhirTheme

@Composable
fun Homepage(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Yangmahal Aero Y",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.motor2),
            contentDescription = "Motor Image",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Divider(modifier = Modifier.padding(bottom = 30.dp, start = 10.dp, end = 10.dp))
        Text(
            text = "Masa Oli Motor",
            fontSize = 18.sp
        )
        Text(
            text = "1000km/ 1-2 bulan",
            fontSize = 18.sp
        )
        Text(
            text = "Servis Terakhir",
            fontSize = 13.sp,
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 10.dp, start = 10.dp)
        )
        Row(modifier = Modifier
            .align(Alignment.Start)
            .padding(10.dp,),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            // Add 4 icons here, for example:
            Spacer(modifier = Modifier.padding(start = 8.dp))
            Image(
                painter = painterResource(id = R.drawable.brake),
                contentDescription = "brake_service",
                modifier = Modifier.size(40.dp),

                )
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                painter = painterResource(id = R.drawable.oil),
                contentDescription = "Info",
                modifier = Modifier
                    .size(40.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                painter = painterResource(id = R.drawable.ecu),
                contentDescription = "Favorite",
                modifier = Modifier.size(40.dp)
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                painter = painterResource(id = R.drawable.engine),
                contentDescription = "Settings",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Preview
@Composable
fun Homeprev(){
_044_ProjectAkhirTheme {
    Homepage()
}
}