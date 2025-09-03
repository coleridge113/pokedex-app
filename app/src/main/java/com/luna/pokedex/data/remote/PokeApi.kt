package com.luna.pokedex.data.remote

import com.luna.pokedex.data.remote.responses.pokemon.PokemonDto
import com.luna.pokedex.data.remote.responses.pokemon_list.PokemonListDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("v2/pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonListDto

    @GET("v2/pokemon/{pokemonId}")
    suspend fun getPokemonInfo(
        @Path("pokemonId") pokemonId: String
    ): PokemonDto

}