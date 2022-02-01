package com.javier.kantostartersnavcomponent.navigation

enum class PokeScreens{
    HomeScreen,
    DetailScreen;
    companion object{
        fun fromRoute(route: String?): PokeScreens =
            when (route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DetailScreen.name -> DetailScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not accesible")
            }
    }
}