package com.luna.pokedex.data.remote.responses.pokemon


import com.google.gson.annotations.SerializedName

data class Version(
    val name: String,
    val url: String
)