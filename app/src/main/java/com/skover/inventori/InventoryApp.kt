package com.skover.inventori

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventoryApp() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Привет!") },
            colors = topAppBarColors(containerColor = Color.Green)
        )
    })
    { padding ->
        val navController = rememberNavController()
        NavHost(
            navController = navController, startDestination = INVETORi_SCREEN,
            modifier = Modifier.padding(padding)

        ) {
            composable(INVETORi_SCREEN) { CityiScreen(navController) }
            composable(ADD_ITEM_SCREEN) { AddItemScreen(navController) }
            composable(EDIT_ITEM_SCREEN) { EditItemScreen(navController) }
            composable(ITEM_DETALIC_SCREEN) { ItemDetalicScreen(navController) }

        }
    }
}
@Composable
fun AddItemScreen(navController: NavHostController) {
    var name by rememberSaveable { mutableStateOf("") }
    var surname by rememberSaveable { mutableStateOf("") }
    var resualt by rememberSaveable { mutableStateOf("") }
    Column {
        TextField(value = name, onValueChange = { name = it })
        TextField(value = surname, onValueChange = { surname = it })
        Button(onClick = { resualt =  "$name $surname "  }) {
            Text(text = "Aнука что там")
        }

    }

}

@Composable
fun EditItemScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun ItemDetalicScreen(navController: NavHostController) {
    TODO("Not yet implemented")
}


const val INVETORi_SCREEN = "Inventori"
const val ADD_ITEM_SCREEN = "Add aitem"
const val EDIT_ITEM_SCREEN = "Edit item"
const val ITEM_DETALIC_SCREEN = "ItemDetalicScreen"
