package com.al.astronauts.service

import com.al.astronauts.db.IssPositionHistoryDao
import com.al.astronauts.model.AstronautsState
import com.al.astronauts.model.ISSState
import com.al.astronauts.model.IssPosition
import com.al.astronauts.model.IssPositionHistory

class SpaceRepository(
    private val spaceService: SpaceService,
    private val issPositionHistoryDao: IssPositionHistoryDao
    ) {

    suspend fun getISSLocation(currentLocation: IssPosition?): ISSState {
        val response = spaceService.getISSLocation()
        return when(response?.message) {
            SUCCESS_MESSAGE -> {
                currentLocation?.let {
                    issPositionHistoryDao.clear()
                    issPositionHistoryDao.insert(IssPositionHistory(currentLocation.latitude,currentLocation.longitude,System.currentTimeMillis()))
                }

                val position = response?.issPosition
                if (position != null) {
                    ISSState.HasISSLocation(position)
                }
                else ISSState.Error("Received null position ")
            }

            else -> ISSState.Error(response?.message.orEmpty())
        }
    }

    suspend fun getAstronautsLocation(): AstronautsState {
        val response = spaceService.getAstronauts()
        return when (response?.message){
            SUCCESS_MESSAGE -> {
                val astronauts = response?.people
                if (astronauts != null) AstronautsState.HasAstronauts(astronauts)
                else AstronautsState.Error("Received empty list ")
            }

            else -> AstronautsState.Error(response?.message.orEmpty())
        }
    }

    suspend fun getISSPastLocation() = issPositionHistoryDao.getPositionHistory()

    companion object{
        const val SUCCESS_MESSAGE = "success"
    }
}