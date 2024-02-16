package com.al.astronauts.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.al.astronauts.model.IssPositionHistory


@Dao
interface IssPositionHistoryDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(location: IssPositionHistory)

    @Query("DELETE FROM issPastLocation")
    suspend fun clear()

    @Query("SELECT * FROM issPastLocation")
    suspend fun getPositionHistory(): List<IssPositionHistory>
}