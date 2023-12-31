package com.kzdev.first_generation_pokedexgit.model

import android.media.Image

data class Pokemon(
    val id: Int,
    val sprites:PokemonImage,
    val baseExperience: Int,
    val forms:List<PokemonForms>,
    val height: Int,
    val locationArea: String,
    val status:PokemonStatus,
    val name: String,
    val types:List<PokemonTypes>,
    val weight: Int,
    val abilities: List<PokemonAbilities>
)
