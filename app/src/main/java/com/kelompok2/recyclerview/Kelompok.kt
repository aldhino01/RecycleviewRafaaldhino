package com.kelompok2.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kelompok(
    val imgKelompok: Int,
    val nameKelompok: String,
    val descKelompok: String
) : Parcelable
