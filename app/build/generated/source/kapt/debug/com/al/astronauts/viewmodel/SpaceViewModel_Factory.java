package com.al.astronauts.viewmodel;

import com.al.astronauts.service.SpaceRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class SpaceViewModel_Factory implements Factory<SpaceViewModel> {
  private final Provider<SpaceRepository> spaceRepositoryProvider;

  public SpaceViewModel_Factory(Provider<SpaceRepository> spaceRepositoryProvider) {
    this.spaceRepositoryProvider = spaceRepositoryProvider;
  }

  @Override
  public SpaceViewModel get() {
    return newInstance(spaceRepositoryProvider.get());
  }

  public static SpaceViewModel_Factory create(Provider<SpaceRepository> spaceRepositoryProvider) {
    return new SpaceViewModel_Factory(spaceRepositoryProvider);
  }

  public static SpaceViewModel newInstance(SpaceRepository spaceRepository) {
    return new SpaceViewModel(spaceRepository);
  }
}
