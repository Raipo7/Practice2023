package com.example.practice2023

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier.background(Color.Black)) {
                LazyColumn {
                    item {
                        Image(
                            painter = painterResource(id = R.drawable.upperdota),
                            contentDescription = "upperPart",
                            modifier = Modifier.size(480.dp, 342.dp)
                        )
                    }
                    item {
                        Row(
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(end = 14.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.logo),
                                contentDescription = "logo",
                                modifier = Modifier
                                    .size(128.dp)
                                    .padding(10.dp)
                            )
                            Column {
                                Text(
                                    text = "DoTA 2",
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontSize = 20.sp,
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Image(
                                        painter = painterResource(id = R.drawable.fivestars),
                                        contentDescription = "stars5",
                                        modifier = Modifier.size(80.dp, 14.dp)
                                    )
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text(
                                        text = "70M",
                                        fontFamily = FontFamily.SansSerif,
                                        color = Color.White,
                                        fontSize = 13.sp,
                                        modifier = Modifier.alpha(0.3f)
                                    )
                                }
                            }
                        }
                    }
                    item {
                        Row {
                            Spacer(modifier = Modifier.width(14.dp))
                            Categories(category = "MOBA", w = 50, h = 20)
                            Spacer(modifier = Modifier.width(8.dp))
                            Categories(category = "MULTIPLAYER", w = 100, h = 20)
                            Spacer(modifier = Modifier.width(8.dp))
                            Categories(category = "STRATEGY", w = 80, h = 20)
                        }
                    }
                    item {
                        Row(
                            modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(bottom = 20.dp)
                                .padding(end = 14.dp)
                        ) {
                            Text(
                                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                                fontFamily = FontFamily.SansSerif,
                                color = Color.White,
                                fontSize = 13.sp,
                                lineHeight = 18.sp,
                                modifier = Modifier.alpha(0.7f)
                            )
                        }
                    }
                    item {
                        LazyRow(
                            modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(bottom = 20.dp)
                                .padding(end = 14.dp)
                        ) {
                            item {
                                val url = "https://www.youtube.com/watch?v=-cSFPIwMEq4"
                                val context = LocalContext.current
                                Box {
                                    Image(
                                        painter = painterResource(R.drawable.trailer),
                                        contentDescription = "Превью видео",
                                        modifier = Modifier.size(280.dp, 160.dp)
                                    )
                                    IconButton(
                                        onClick = {
                                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                            context.startActivity(intent)
                                        },
                                        modifier = Modifier
                                            .align(Alignment.Center)
                                            .size(64.dp),
                                        content = {
                                            Icon(
                                                Icons.Filled.PlayArrow,
                                                contentDescription = "Начать видео",
                                                tint = Color.White,
                                                modifier = Modifier.size(80.dp)
                                            )
                                        }
                                    )
                                }
                            }
                            item {
                                Spacer(modifier = Modifier.width(8.dp))
                                Image(
                                    painter = painterResource(R.drawable.dotapicture),
                                    contentDescription = "Фото дота2",
                                    modifier = Modifier.size(280.dp, 160.dp)
                                )
                            }
                        }
                    }
                    item {
                        Row(
                            modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(end = 14.dp)
                        ) {
                            Text(
                                text = "Review & Ratings",
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 16.sp
                            )
                        }
                    }
                    item {
                        Row(
                            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(end = 14.dp)
                                .padding(bottom = 20.dp)
                        ) {
                            Text(
                                text = "4.6",
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 48.sp,
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Image(
                                    painter = painterResource(id = R.drawable.four_point_nine_stars),
                                    contentDescription = "stars4.9",
                                    modifier = Modifier.size(80.dp, 14.dp)
                                )
                                Text(
                                    text = "70M Reviews",
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.White,
                                    fontSize = 13.sp,
                                    modifier = Modifier.alpha(0.7f)
                                )
                            }
                        }
                    }
                    item {
                        Review(name = "Mikhail Gorshenev", imageName = "avatar1")
                        Review(name = "Andrey Knyazev", imageName = "avatar2")
                    }
                    item {
                        val url = "https://store.steampowered.com/app/570/Dota_2/"
                        val context = LocalContext.current
                        Row(
                            modifier = Modifier
                                .padding(start = 14.dp)
                                .padding(end = 14.dp)
                                .padding(bottom = 20.dp)
                        ) {
                            Button(
                                onClick = {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                    context.startActivity(intent)
                                          },
                                colors = ButtonDefaults.buttonColors(Color.Transparent),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.Yellow, shape = RoundedCornerShape(8.dp))
                            ) {
                                Text(
                                    text = "Install",
                                    fontFamily = FontFamily.SansSerif,
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@SuppressLint("DiscouragedApi")
@Composable
fun Review(name: String, imageName: String) {
    val context = LocalContext.current
    val resourceId = context.resources.getIdentifier(imageName, "drawable", context.packageName)
    val painter = painterResource(id = resourceId)
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .padding(start = 14.dp)
        .padding(bottom = 7.dp)
        .padding(end = 14.dp)) {
        Image(
            painter = painter,
            contentDescription = "photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = name,
                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                fontSize = 16.sp,
            )
            Text(
                text = "February 14, 2019",
                fontFamily = FontFamily.SansSerif,
                color = Color.White,
                fontSize = 13.sp,
                modifier = Modifier.alpha(0.5f))
        }
    }
    Row(
        modifier = Modifier
            .padding(start = 14.dp)
            .padding(bottom = 40.dp)
            .padding(end = 14.dp)
    ) {
        Text(
            text = "\"Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.\"",
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            fontSize = 13.sp,
            lineHeight = 18.sp,
            modifier = Modifier.alpha(0.7f)
        )
    }
}

@Composable
fun Categories(category: String, w: Int, h: Int) {
    val myColor = Color(0x44A9F4FF)
    Text(
        text = category,
        fontFamily = FontFamily.SansSerif,
        color = Color.White.copy(alpha = 0.5f),
        fontSize = 13.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(vertical = 20.dp)
            .clip(RoundedCornerShape(25.dp))
            .background(myColor.copy(alpha = 0.5f))
            .width(w.dp)
            .height(h.dp)
    )
}
