package com.luna.pokedex.data.remote.responses.pokemon


import com.google.gson.annotations.SerializedName

data class PastAbility(
    val abilities: List<AbilityXX>,
    val generation: Generation
)