package com.al.astronauts.di;

import com.al.astronauts.db.IssPositionHistoryDao;
import com.al.astronauts.db.SpaceDataBase;
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
public final class ApplicationModule_ProvideDao$app_debugFactory implements Factory<IssPositionHistoryDao> {
  private final ApplicationModule module;

  private final Provider<SpaceDataBase> dbProvider;

  public ApplicationModule_ProvideDao$app_debugFactory(ApplicationModule module,
      Provider<SpaceDataBase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public IssPositionHistoryDao get() {
    return provideDao$app_debug(module, dbProvider.get());
  }

  public static ApplicationModule_ProvideDao$app_debugFactory create(ApplicationModule module,
      Provider<SpaceDataBase> dbProvider) {
    return new ApplicationModule_ProvideDao$app_debugFactory(module, dbProvider);
  }

  public static IssPositionHistoryDao provideDao$app_debug(ApplicationModule instance,
      SpaceDataBase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideDao$app_debug(db));
  }
}
