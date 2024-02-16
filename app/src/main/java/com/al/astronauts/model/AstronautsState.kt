package com.al.astronauts.model

sealed class AstronautsState {
    object Loading : AstronautsState()
    data class Error(val msg: String) : AstronautsState()
    data class HasAstronauts(val astronauts: List<People>) : AstronautsState()
}