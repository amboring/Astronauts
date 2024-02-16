package com.al.astronauts.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\b\u0010\u0013\u001a\u00020\u0011H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/al/astronauts/di/ApplicationModule;", "", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "provideAppDatabase", "Lcom/al/astronauts/db/SpaceDataBase;", "appContext", "Landroid/content/Context;", "provideApplicationContext", "provideDao", "Lcom/al/astronauts/db/IssPositionHistoryDao;", "db", "provideDao$app_debug", "provideRepository", "Lcom/al/astronauts/service/SpaceRepository;", "service", "Lcom/al/astronauts/service/SpaceService;", "dao", "provideSpaceService", "app_debug"})
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application app = null;
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final android.content.Context provideApplicationContext() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.al.astronauts.service.SpaceService provideSpaceService() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.al.astronauts.db.SpaceDataBase provideAppDatabase(@org.jetbrains.annotations.NotNull
    android.content.Context appContext) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.al.astronauts.db.IssPositionHistoryDao provideDao$app_debug(@org.jetbrains.annotations.NotNull
    com.al.astronauts.db.SpaceDataBase db) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.al.astronauts.service.SpaceRepository provideRepository(@org.jetbrains.annotations.NotNull
    com.al.astronauts.service.SpaceService service, @org.jetbrains.annotations.NotNull
    com.al.astronauts.db.IssPositionHistoryDao dao) {
        return null;
    }
}