package com.luna.pokedex.data.remote.responses.pokemon_list


import com.google.gson.annotations.SerializedName

data class Result(
    val name: String,
    val url: String
)