package com.javier.kantostartersnavcomponent.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.javier.kantostartersnavcomponent.R.*
import com.javier.kantostartersnavcomponent.data_poke.Iniciales

@ExperimentalFoundationApi
@Composable
fun CardRow(poke: Iniciales, id: (Int) -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(Color(0xFFFFFAF7)),
        shape = RectangleShape,
        elevation = 2.dp,
        border = BorderStroke(2.dp, Color.Black)
        ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
        ) {
            Column {
                Image(painterResource(when(poke.img){
                    1 -> drawable.bulbasaur
                    2 -> drawable.charmander
                    3 -> drawable.squirtle
                    else -> drawable.blastoise
                }), contentDescription = "$poke.name")
            }
            Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = poke.number.toString())
                Spacer(Modifier.height(6.dp))
                Text(text = poke.name)
            }
        }
    }
}