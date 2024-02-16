package com.al.astronauts.di;

import com.al.astronauts.service.SpaceService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ApplicationModule_ProvideSpaceServiceFactory implements Factory<SpaceService> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideSpaceServiceFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public SpaceService get() {
    return provideSpaceService(module);
  }

  public static ApplicationModule_ProvideSpaceServiceFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideSpaceServiceFactory(module);
  }

  public static SpaceService provideSpaceService(ApplicationModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSpaceService());
  }
}
