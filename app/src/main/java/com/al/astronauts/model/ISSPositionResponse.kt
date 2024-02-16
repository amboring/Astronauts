package com.al.astronauts.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class ISSPositionResponse(
    @SerializedName("iss_position")
    val issPosition: IssPosition?,
    val message: String?,
    val timestamp: Int?
)


data class IssPosition(
    val latitude: String?,
    val longitude: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(latitude)
        parcel.writeString(longitude)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<IssPosition> {
        override fun createFromParcel(parcel: Parcel): IssPosition {
            return IssPosition(parcel)
        }

        override fun newArray(size: Int): Array<IssPosition?> {
            return arrayOfNulls(size)
        }
    }
}

@Entity(tableName = "issPastLocation")
data class IssPositionHistory(
    val latitude: String?,
    val longitude: String?,
    @PrimaryKey val timestamp: Long?
)