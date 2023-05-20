package com.example.persondetailshow

import android.os.Parcel
import android.os.Parcelable

data class PersonDetail(
    var name:String,
    var age:String,
    var email:String,
    var birthDate:String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
        parcel.writeString(email)
        parcel.writeString(birthDate)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonDetail> {
        override fun createFromParcel(parcel: Parcel): PersonDetail {
            return PersonDetail(parcel)
        }

        override fun newArray(size: Int): Array<PersonDetail?> {
            return arrayOfNulls(size)
        }
    }
}
