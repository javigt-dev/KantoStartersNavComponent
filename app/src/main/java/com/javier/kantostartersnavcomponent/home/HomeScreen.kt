package com.javier.kantostartersnavcomponent.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.javier.kantostartersnavcomponent.R
import com.javier.kantostartersnavcomponent.data_poke.Iniciales

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController) {

    val listPokeName: Map<Int, String> = mapOf(Pair(1, "Bulbasaur"), Pair(2, "Charmander"), Pair(3, "Squirtle"))

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        color = Color(0xFF928B86)
    ) {
        Column {
            for ((num, name) in listPokeName){
                CardRow(poke = Iniciales(num, name, when(num){
                    1 -> R.drawable.bulbasaur
                    2 -> R.drawable.charmander
                    3 -> R.drawable.squirtle
                    else -> R.drawable.blastoise
                })){
                    
                }
            }

        }
    }
}