package com.javier.kantostartersnavcomponent.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.javier.kantostartersnavcomponent.detail.DetailScreen
import com.javier.kantostartersnavcomponent.home.HomeScreen

@Composable
fun DexNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PokeScreens.HomeScreen.name){
        composable(PokeScreens.HomeScreen.name){
            HomeScreen(navController = navController)
        }
        composable(PokeScreens.DetailScreen.name){
            DetailScreen(navController = navController)
        }

    }
}