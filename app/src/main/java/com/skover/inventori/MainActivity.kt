package com.skover.inventori

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InventoryApp()
        }
    }
}

@Composable
fun InventoryApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SCREEN_HOUSE) {

        composable(SCREEN_HOUSE) { ScreenHouse(navController) }
        composable(SCREEN_WALK) { ScreenWalk(navController) }
        composable(SCREEN_HOME) { ScreenHome(navController) }
        composable(SCREEN_ATB) { ScreenAtb(navController) }
    }
}


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


