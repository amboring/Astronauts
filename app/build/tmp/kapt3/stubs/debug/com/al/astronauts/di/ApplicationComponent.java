package com.al.astronauts.di;

@javax.inject.Singleton
@dagger.Component(modules = {com.al.astronauts.di.ApplicationModule.class, com.al.astronauts.di.ViewModelModule.class, com.al.astronauts.di.ApplicationViewModelModule.class})
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/al/astronauts/di/ApplicationComponent;", "", "inject", "", "locationListFragment", "Lcom/al/astronauts/view/LocationListFragment;", "mainActivity", "Lcom/al/astronauts/view/MainActivity;", "app_debug"})
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.al.astronauts.view.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.al.astronauts.view.LocationListFragment locationListFragment);
}