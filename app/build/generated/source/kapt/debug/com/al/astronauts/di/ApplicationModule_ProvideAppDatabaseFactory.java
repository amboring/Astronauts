package com.al.astronauts.di;

import android.content.Context;
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
public final class ApplicationModule_ProvideAppDatabaseFactory implements Factory<SpaceDataBase> {
  private final ApplicationModule module;

  private final Provider<Context> appContextProvider;

  public ApplicationModule_ProvideAppDatabaseFactory(ApplicationModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public SpaceDataBase get() {
    return provideAppDatabase(module, appContextProvider.get());
  }

  public static ApplicationModule_ProvideAppDatabaseFactory create(ApplicationModule module,
      Provider<Context> appContextProvider) {
    return new ApplicationModule_ProvideAppDatabaseFactory(module, appContextProvider);
  }

  public static SpaceDataBase provideAppDatabase(ApplicationModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppDatabase(appContext));
  }
}
