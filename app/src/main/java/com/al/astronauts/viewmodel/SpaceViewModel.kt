package com.al.astronauts.viewmodel

import android.location.Location
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.distinctUntilChanged
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.al.astronauts.model.AstronautsState
import com.al.astronauts.model.ISSState
import com.al.astronauts.service.SpaceRepository
import com.al.astronauts.util.DistanceCalculator.Companion.getDistance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class SpaceViewModel @Inject constructor(
    private val spaceRepository: SpaceRepository
) : ViewModel() {
    private val _astronautsState: MutableLiveData<AstronautsState> = MutableLiveData()
    val astronautsState: LiveData<AstronautsState> = _astronautsState

    private val _issState: MutableLiveData<ISSState> = MutableLiveData()
    val issState: LiveData<ISSState> = _issState
    val issText: LiveData<String> = _issState.map { issState ->
        val location = (issState as? ISSState.HasISSLocation)?.location
        if (location != null) "[ ${location.latitude.orEmpty()}, ${location.longitude.orEmpty()} ]" else ""
    }.distinctUntilChanged()

    private val _lastIssLocation: MutableLiveData<String> = MutableLiveData()
    val lastIssLocation: LiveData<String> = _lastIssLocation

    val userLocation = MutableLiveData<Location?>()

    val loadingVisibility = MediatorLiveData<Int>()
        .apply {
            fun update() {
                val loadingISS = issState.value is ISSState.Loading
                val loadingAstronauts = astronautsState.value is AstronautsState.Loading

                value = if (loadingAstronauts || loadingISS) View.VISIBLE else View.GONE
            }

            addSource(astronautsState) { update() }
            addSource(issState) { update() }

            update()
        }

    val distance = MediatorLiveData<String>()
        .apply {
            fun update() {
                val issLocation = (issState.value as? ISSState.HasISSLocation)?.location
                val userLocation = userLocation.value

                val distance  = getDistance(
                    issLocation?.latitude?.toDouble()?:0.0,
                    issLocation?.longitude?.toDouble()?:0.0,
                    userLocation?.latitude?:0.0,
                    userLocation?.longitude?:0.0
                )
                value = "$distance meters"
            }

            addSource(astronautsState) { update() }
            addSource(issState) { update() }

            update()
        }

    fun getAstronautsList() {
        _astronautsState.postValue(AstronautsState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val location = spaceRepository.getAstronautsLocation()
                _astronautsState.postValue(location)
            } catch (e: Exception) {
                _astronautsState.postValue(AstronautsState.Error(e.message.orEmpty()))
                e.printStackTrace()
            }
        }
    }

    fun getIssLocation() {
        val history = (_issState.value as? ISSState.HasISSLocation)?.location
        _issState.postValue(ISSState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val location = spaceRepository.getISSLocation(history)
//                Log.i("alalal", "iss: $location")
                _issState.postValue(location)
            } catch (e: Exception) {
                _issState.postValue(ISSState.Error(e.message.orEmpty()))
                e.printStackTrace()
            }
        }
        viewModelScope.launch (Dispatchers.IO){
            try {
                spaceRepository.getISSPastLocation()?.get(0)?.let {
                    _lastIssLocation.postValue("[ ${it.latitude.orEmpty()}, ${it.longitude.orEmpty()} ]")
                }
            } catch (e: Exception) {
                _lastIssLocation.postValue("")
                e.printStackTrace()
            }
        }
    }
}