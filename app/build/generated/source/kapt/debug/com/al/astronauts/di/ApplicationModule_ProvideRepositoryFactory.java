package com.al.astronauts.di;

import com.al.astronauts.db.IssPositionHistoryDao;
import com.al.astronauts.service.SpaceRepository;
import com.al.astronauts.service.SpaceService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class ApplicationModule_ProvideRepositoryFactory implements Factory<SpaceRepository> {
  private final ApplicationModule module;

  private final Provider<SpaceService> serviceProvider;

  private final Provider<IssPositionHistoryDao> daoProvider;

  public ApplicationModule_ProvideRepositoryFactory(ApplicationModule module,
      Provider<SpaceService> serviceProvider, Provider<IssPositionHistoryDao> daoProvider) {
    this.module = module;
    this.serviceProvider = serviceProvider;
    this.daoProvider = daoProvider;
  }

  @Override
  public SpaceRepository get() {
    return provideRepository(module, serviceProvider.get(), daoProvider.get());
  }

  public static ApplicationModule_ProvideRepositoryFactory create(ApplicationModule module,
      Provider<SpaceService> serviceProvider, Provider<IssPositionHistoryDao> daoProvider) {
    return new ApplicationModule_ProvideRepositoryFactory(module, serviceProvider, daoProvider);
  }

  public static SpaceRepository provideRepository(ApplicationModule instance, SpaceService service,
      IssPositionHistoryDao dao) {
    return Preconditions.checkNotNullFromProvides(instance.provideRepository(service, dao));
  }
}
