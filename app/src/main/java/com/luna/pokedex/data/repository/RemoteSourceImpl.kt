package com.luna.pokedex.data.repository

import com.luna.pokedex.common.Resource
import com.luna.pokedex.data.remote.PokeApi
import com.luna.pokedex.data.remote.responses.pokemon.PokemonDto
import com.luna.pokedex.data.remote.responses.pokemon_list.PokemonListDto
import com.luna.pokedex.domain.repository.Repository
import javax.inject.Inject

class RemoteSourceImpl @Inject constructor(
    private val api: PokeApi
) : Repository {

    override suspend fun getPokemonList(
        limit: Int,
        offset: Int
    ): Resource<PokemonListDto> {
        return try {
            val response = api.getPokemonList(limit, offset)
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage ?: "An unknown error occurred.")
        }
    }

    override suspend fun getPokemonInfo(pokemonId: String): Resource<PokemonDto> {
        return try {
            val response = api.getPokemonInfo(pokemonId)
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.localizedMessage ?: "An unknown error occurred.")
        }
    }
}