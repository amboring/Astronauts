package com.al.astronauts.di

import com.al.astronauts.view.LocationListFragment
import com.al.astronauts.view.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ViewModelModule::class,
    ApplicationViewModelModule::class
])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(locationListFragment: LocationListFragment)
//    fun inject(mapFragment: MapFragment)
}