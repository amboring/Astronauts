package com.al.astronauts.di;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.al.astronauts.db.IssPositionHistoryDao;
import com.al.astronauts.db.SpaceDataBase;
import com.al.astronauts.service.SpaceRepository;
import com.al.astronauts.service.SpaceService;
import com.al.astronauts.view.LocationListFragment;
import com.al.astronauts.view.LocationListFragment_MembersInjector;
import com.al.astronauts.view.MainActivity;
import com.al.astronauts.viewmodel.SpaceViewModel;
import com.al.astronauts.viewmodel.SpaceViewModel_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.annotation.Generated;
import javax.inject.Provider;

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
public final class DaggerApplicationComponent {
  private DaggerApplicationComponent() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationModule applicationModule;

    private Builder() {
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public ApplicationComponent build() {
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      return new ApplicationComponentImpl(applicationModule);
    }
  }

  private static final class ApplicationComponentImpl implements ApplicationComponent {
    private final ApplicationComponentImpl applicationComponentImpl = this;

    private Provider<SpaceService> provideSpaceServiceProvider;

    private Provider<Context> provideApplicationContextProvider;

    private Provider<SpaceDataBase> provideAppDatabaseProvider;

    private Provider<IssPositionHistoryDao> provideDao$app_debugProvider;

    private Provider<SpaceRepository> provideRepositoryProvider;

    private Provider<SpaceViewModel> spaceViewModelProvider;

    private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

    private Provider<ViewModelFactory> viewModelFactoryProvider;

    private ApplicationComponentImpl(ApplicationModule applicationModuleParam) {

      initialize(applicationModuleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationModule applicationModuleParam) {
      this.provideSpaceServiceProvider = DoubleCheck.provider(ApplicationModule_ProvideSpaceServiceFactory.create(applicationModuleParam));
      this.provideApplicationContextProvider = DoubleCheck.provider(ApplicationModule_ProvideApplicationContextFactory.create(applicationModuleParam));
      this.provideAppDatabaseProvider = DoubleCheck.provider(ApplicationModule_ProvideAppDatabaseFactory.create(applicationModuleParam, provideApplicationContextProvider));
      this.provideDao$app_debugProvider = DoubleCheck.provider(ApplicationModule_ProvideDao$app_debugFactory.create(applicationModuleParam, provideAppDatabaseProvider));
      this.provideRepositoryProvider = DoubleCheck.provider(ApplicationModule_ProvideRepositoryFactory.create(applicationModuleParam, provideSpaceServiceProvider, provideDao$app_debugProvider));
      this.spaceViewModelProvider = SpaceViewModel_Factory.create(provideRepositoryProvider);
      this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(SpaceViewModel.class, ((Provider) spaceViewModelProvider)).build();
      this.viewModelFactoryProvider = DoubleCheck.provider(ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
    }

    @Override
    public void inject(MainActivity mainActivity) {
    }

    @Override
    public void inject(LocationListFragment locationListFragment) {
      injectLocationListFragment(locationListFragment);
    }

    private LocationListFragment injectLocationListFragment(LocationListFragment instance) {
      LocationListFragment_MembersInjector.injectViewModelFactory(instance, viewModelFactoryProvider.get());
      return instance;
    }
  }
}
