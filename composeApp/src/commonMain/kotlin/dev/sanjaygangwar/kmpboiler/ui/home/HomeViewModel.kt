package dev.sanjaygangwar.kmpboiler.ui.home

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import dev.sanjaygangwar.kmpboiler.models.Characters
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _characters = MutableStateFlow<List<Characters>>(emptyList())
    val characters: StateFlow<List<Characters>> = _characters


    init {
        val sampleCharacters = listOf(
            Characters(
                _id = "1",
                episodes = listOf("S01E01", "S01E02", "S01E03"),
                id = "char_001",
                location = "Earth (C-137)",
                name = "Rick Sanchez",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "2",
                episodes = listOf("S01E01", "S01E02"),
                id = "char_002",
                location = "Earth (Replacement Dimension)",
                name = "Morty Smith",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "3",
                episodes = listOf("S01E05", "S01E07"),
                id = "char_003",
                location = "Citadel of Ricks",
                name = "Birdperson",
                origin = "Bird World",
                species = "Bird-Person",
                status = "Deceased"
            ), Characters(
                _id = "1",
                episodes = listOf("S01E01", "S01E02", "S01E03"),
                id = "char_001",
                location = "Earth (C-137)",
                name = "Rick Sanchez",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "2",
                episodes = listOf("S01E01", "S01E02"),
                id = "char_002",
                location = "Earth (Replacement Dimension)",
                name = "Morty Smith",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "3",
                episodes = listOf("S01E05", "S01E07"),
                id = "char_003",
                location = "Citadel of Ricks",
                name = "Birdperson",
                origin = "Bird World",
                species = "Bird-Person",
                status = "Deceased"
            ), Characters(
                _id = "1",
                episodes = listOf("S01E01", "S01E02", "S01E03"),
                id = "char_001",
                location = "Earth (C-137)",
                name = "Rick Sanchez",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "2",
                episodes = listOf("S01E01", "S01E02"),
                id = "char_002",
                location = "Earth (Replacement Dimension)",
                name = "Morty Smith",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "3",
                episodes = listOf("S01E05", "S01E07"),
                id = "char_003",
                location = "Citadel of Ricks",
                name = "Birdperson",
                origin = "Bird World",
                species = "Bird-Person",
                status = "Deceased"
            ), Characters(
                _id = "1",
                episodes = listOf("S01E01", "S01E02", "S01E03"),
                id = "char_001",
                location = "Earth (C-137)",
                name = "Rick Sanchez",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "2",
                episodes = listOf("S01E01", "S01E02"),
                id = "char_002",
                location = "Earth (Replacement Dimension)",
                name = "Morty Smith",
                origin = "Earth (C-137)",
                species = "Human",
                status = "Alive"
            ),
            Characters(
                _id = "3",
                episodes = listOf("S01E05", "S01E07"),
                id = "char_003",
                location = "Citadel of Ricks",
                name = "Birdperson",
                origin = "Bird World",
                species = "Bird-Person",
                status = "Deceased"
            )
        )

        // Sample dummy data
        _characters.value = sampleCharacters
    }

}