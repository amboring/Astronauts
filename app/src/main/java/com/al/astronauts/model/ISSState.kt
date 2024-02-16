package com.al.astronauts.model

sealed class ISSState {
    object Loading : ISSState()
    data class Error(val msg: String) : ISSState()
    data class HasISSLocation(val location: IssPosition) : ISSState()
}