package com.al.astronauts.view;

import com.al.astronauts.di.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LocationListFragment_MembersInjector implements MembersInjector<LocationListFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public LocationListFragment_MembersInjector(Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LocationListFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new LocationListFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(LocationListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.al.astronauts.view.LocationListFragment.viewModelFactory")
  public static void injectViewModelFactory(LocationListFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
