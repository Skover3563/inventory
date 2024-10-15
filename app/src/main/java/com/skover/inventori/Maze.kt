package com.skover.inventori


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


const val SCREEN_FOREST = "screen_forest"
const val SCREEN_CAVE = "screen_cave"
const val SCREEN_CAVE2 = "screen_cave2"
const val SCREEN_STRANIK = "screen_stranik"
const val SCREEN_WICKED = "screen_wicked"
const val SCREEN_STRANIK2 = "screen_stranik2"
const val SCREEN_CLIND = "screen_clind"
const val SCREEN_EXIT = "screen_exit"


@Composable
fun ScreenForest(navController: NavHostController) {

    Image(
        painter = painterResource(R.drawable.mein1),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillHeight
    )
    Box(Modifier.fillMaxSize()){
    Text(text = "Оу...Походу я заблудился",
    modifier = Modifier.align(Alignment.BottomEnd).padding(16.dp),fontSize = 18.sp, fontWeight = FontWeight.W900,
    )
}

    Column {


        Button(
            onClick = { navController.navigate(SCREEN_CAVE) }, modifier = Modifier.offset(
                x = 280.dp, y = 650
                    .dp
            )
        ) {
            Text(text = "Итди дальше")
        }
        Button(
            onClick = { navController.navigate(SCREEN_EXIT) }, modifier = Modifier.offset(
                x = 60.dp, y = 400.dp
            )
        ) {
            Text(text = "Выйти из игры")
        }

    }
}

@Composable
fun ScreenCave(navController: NavHostController) {
    Image(
        painter = painterResource(R.drawable.cave),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillHeight
    )

    Column {
        Text(
            text = "Ооо Пещера", fontSize = 30.sp, fontWeight = FontWeight.W900,
            modifier = Modifier
                .offset(x = 40.dp, y = 400.dp)
        )
        Button(
            onClick = { navController.navigate(SCREEN_CAVE2) }, modifier = Modifier.offset(
                x = 60.dp, y = 400.dp
            )
        ) {
            Text(text = "Зайти В пещеру")

            Button(
                onClick = { navController.navigate(SCREEN_EXIT) }, modifier = Modifier.offset(
                    x = 60.dp, y = 400.dp
                )
            ) {
                Text(text = "Выйти из игры")
            }
        }
    }
}

@Composable
fun ScreenCave2(navController: NavHostController) {

    Image(
        painter = painterResource(R.drawable.fonnp),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillHeight
    )

    Column {
        Text(
            text = "Аййй как больно,надо теперь выбиратся из пищеры",
            fontSize = 30.sp,
            fontWeight = FontWeight.W900,
            modifier = Modifier
                .offset(x = 40.dp, y = 400.dp)
        )
        Button(
            onClick = { navController.navigate(SCREEN_STRANIK) }, modifier = Modifier.offset(
                x = 60.dp, y = 400.dp
            )
        ) {
            Text(text = "Итди искать выход")
            Button(
                onClick = { navController.navigate(SCREEN_EXIT) }, modifier = Modifier.offset(
                    x = 60.dp, y = 400.dp
                )
            ) {
                Text(text = "Сдаться и Выйти из игры")
            }


        }
    }
}


@Composable
fun ScreenStranik(navController: NavHostController) {
    Image(
        painter = painterResource(R.drawable.stranik),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.FillHeight
    )

}


@Composable
fun ScreenWicked(navController: NavHostController) {
}

@Composable
fun ScreenStranik2(navController: NavHostController) {
}

@Composable
fun ScreenClind(navController: NavHostController) {
}

@Composable
fun ScreenExit(navController: NavHostController) {
}





