package com.example.pokedex.feature_pokedex.utils

sealed class Screens(val route: String) {
    data object ListScreen: Screens("pokemon_list_screen")
    data object DetailScreen: Screens("pokemon_detail_screen")
}