package com.al.astronauts.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.al.astronauts.viewmodel.SpaceViewModel
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}

@Module
abstract class ApplicationViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SpaceViewModel::class)
    abstract fun provideSpaceViewModel(viewModel: SpaceViewModel): ViewModel

}

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
