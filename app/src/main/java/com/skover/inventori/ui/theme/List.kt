package com.skover.inventori.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavHostController


data class Napitok(

    var name: String?,
    var taste: String?,
    var company: String?,
    var price: String?,
    var shelLife: Long?,
    var volume: Long?,

    )

@Composable
fun Listscreen(navController: NavHostController) {
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        var list by rememberSaveable { mutableStateOf(listOf  < Napitok >()) }
        var shelLife by rememberSaveable { mutableStateOf("") }
        var name by rememberSaveable { mutableStateOf("") }
        var taste by rememberSaveable { mutableStateOf("") }
        var company by rememberSaveable { mutableStateOf("") }
        var price by rememberSaveable { mutableStateOf("") }
        var volume by rememberSaveable { mutableStateOf("") }
        TextField(name, { name = it }, label = { Text("Название") })
        TextField(taste, { taste = it }, label = { Text("Вкус") })
        TextField(company, { company = it }, label = { Text("Компания") })
        TextField(price,
            { price = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Цена") })
        TextField(shelLife,
            { shelLife = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("СрокГодности") })
        TextField(volume,
            { volume = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Обьем") })
        Button(onClick = {
            val napitok =
                Napitok(name, taste, company, price, shelLife.toLongOrNull(), volume.toLongOrNull())
            list = list + napitok
        }) {
            Text(text = "Добавить")
        }

        LazyColumn(Modifier.fillMaxSize()) {
            items(list) { napitok ->
                Text(
                    text = "${napitok.name} " +
                            "${napitok.taste}" +
                            " ${napitok.company}" +
                            " ${napitok.price} долоров" +
                            " ${napitok.shelLife}" +
                            "  ${napitok.volume} litr "
                )
            }
        }
    }
}


val LIST_SCREEN = "List_Screen"


