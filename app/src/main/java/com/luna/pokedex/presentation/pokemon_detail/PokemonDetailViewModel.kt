package com.luna.pokedex.presentation.pokemon_detail

import androidx.lifecycle.ViewModel
import com.luna.pokedex.common.Resource
import com.luna.pokedex.data.remote.responses.pokemon.PokemonDto
import com.luna.pokedex.domain.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<PokemonDto> {
        return repository.getPokemonInfo(pokemonName)
    }

}