package com.al.astronauts.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.al.astronauts.model.IssPositionHistory


@Database(entities = [IssPositionHistory::class], version = 1)
abstract class SpaceDataBase : RoomDatabase() {
    abstract fun issPositionDao(): IssPositionHistoryDao
}
