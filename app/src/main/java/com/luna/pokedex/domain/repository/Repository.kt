package com.luna.pokedex.domain.repository

import com.luna.pokedex.common.Resource
import com.luna.pokedex.data.remote.responses.pokemon.PokemonDto
import com.luna.pokedex.data.remote.responses.pokemon_list.PokemonListDto

interface Repository {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonListDto>
    suspend fun getPokemonInfo(pokemonId: String): Resource<PokemonDto>

}