package com.luna.pokedex.data.remote.responses.pokemon


import com.google.gson.annotations.SerializedName

data class AbilityXX(
    val ability: Any,
    @SerializedName("is_hidden")
    val isHidden: Boolean,
    val slot: Int
)