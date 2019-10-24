package sample

import com.ankushg.parcel.Parcelable
import com.ankushg.parcel.Parcelize

expect object Sample {
    fun getUserString(): String
}
@Parcelize
data class User(val userId: Long, val userName: String): Parcelable

