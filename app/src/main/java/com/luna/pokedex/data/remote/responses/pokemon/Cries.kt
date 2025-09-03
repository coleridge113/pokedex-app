package com.luna.pokedex.data.remote.responses.pokemon


import com.google.gson.annotations.SerializedName

data class Cries(
    val latest: String,
    val legacy: String
)