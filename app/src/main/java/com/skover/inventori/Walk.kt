package com.skover.inventori

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


const val SCREEN_HOUSE = "screen_house"
const val SCREEN_WALK = "screen_walk"
const val SCREEN_HOME = "screen_home"
const val SCREEN_ATB = "screen_atb"






@Composable
fun ScreenHouse(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Мы в помещении", fontSize = 50.sp)
        Button(onClick = { navController.navigate(SCREEN_WALK) }) {
            Text(text = "Идем гулять!!")
        }
        Button(onClick = { navController.navigate(SCREEN_HOME) }) {
            Text(text = "Нет, идем домой")
        }
    }
}

@Composable
fun ScreenWalk(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Мы пришли на Балковскую", fontSize = 50.sp)
        Button(onClick = { navController.navigate(SCREEN_HOME) }) {
            Text(text = "Идем дальше")
        }
        Button(onClick = { navController.navigate(SCREEN_HOME) }) {
            Text(text = "Едем на маршрутке домой")
        }
        Button(onClick = { navController.navigate(SCREEN_ATB) }) {
            Text(text = "Идем в АТБ!!!!")
        }
    }
}

@Composable
fun ScreenHome(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Ура, мы добрались домой", fontSize = 50.sp)
        Button(onClick = { navController.popBackStack(SCREEN_HOUSE, false) }) {
            Text(text = "Начать приключение сначала)")
        }
    }
}

@Composable
fun ScreenAtb(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "УУ тут вкусняшки", fontSize = 50.sp)
        Button(onClick = { navController.navigateUp() }) {
            Text(text = "Выходим из АТБ")
        }
    }
}

@Composable
fun TestScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
                .background(Color(color = 0xFF9CC27E)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "View Meeting",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFFFFFFF)
            )
        }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(start = 28.dp, top = 22.dp, end = 20.dp)
        ) {
            Text(
                text = "Design review meeting",
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Meeting Status: ")
            Spacer(modifier = Modifier.height(17.dp))
            Text(text = "Pending", fontSize = 16.sp, fontWeight = W500)
            Spacer(modifier = Modifier.height(33.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Time:", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(14.dp))
            Row {
                Text(text = "30 Mar 2024", fontSize = 16.sp, fontWeight = W500)
                Spacer(modifier = Modifier.weight(1F))
                Text(text = "15:00 - 16:00", fontSize = 16.sp, fontWeight = W500)
            }
            Spacer(modifier = Modifier.height(10.5.dp))
            Text(text = "Timezone Kyiv, UTC+3", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(24.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Place:", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    text = "Online", fontSize = 16.sp, fontWeight = W500,
                    modifier = Modifier.weight(1F)
                )
                Text(
                    text = "Discord Room 1:", fontSize = 16.sp, fontWeight = W500,
                    modifier = Modifier.weight(1F)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Link", fontSize = 16.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .height(37.dp)
                    .fillMaxWidth()
                    .background(Color(0xFFEEF0F3))
                    .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "www.discord.com/tre/meetroom1:",
                    fontSize = 16.sp,
                    fontWeight = W500,
                    color = Color(0XFF6C9E45),
                    textDecoration = TextDecoration.Underline
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Description:", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Pellentesque ornare cursus nibh in pulvinar. Praesent at nibh a nunc vehicula volutpat a non mauris. Praesent eleifend malesuada nunc, non gravida ligula euismod id. Morbi bibendum ipsum id commodo consequat. Nullatpat dolor.",
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(24.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Project:", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Youth Android App", fontSize = 16.sp, fontWeight = W500)
            Spacer(modifier = Modifier.height(24.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Scheduled by:", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Vasia Pupkin", fontSize = 16.sp, fontWeight = W500)
            Spacer(modifier = Modifier.height(24.dp))

        }
    }
}