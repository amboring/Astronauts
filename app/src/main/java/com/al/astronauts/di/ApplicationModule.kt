package com.al.astronauts.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.al.astronauts.db.IssPositionHistoryDao
import com.al.astronauts.db.SpaceDataBase
import com.al.astronauts.service.SpaceRepository
import com.al.astronauts.service.SpaceService
import com.al.astronauts.service.SpaceServiceFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val app: Application) {
    @Provides
    @Singleton
    fun provideApplicationContext(): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideSpaceService(): SpaceService {
        return SpaceServiceFactory.makeService()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(appContext: Context): SpaceDataBase {
        return Room.databaseBuilder(
            appContext,
            SpaceDataBase::class.java,
            "issPastLocation"
        ).build()
    }

    @Provides
    @Singleton
    internal fun provideDao(db: SpaceDataBase): IssPositionHistoryDao {
        return db.issPositionDao()
    }

    @Provides
    @Singleton
    fun provideRepository(service: SpaceService, dao: IssPositionHistoryDao): SpaceRepository {
        return SpaceRepository(service, dao)
    }

}


