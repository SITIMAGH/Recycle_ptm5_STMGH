package com.example.recycle_ptm5

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class inis_var(
    val fotomhs : Int = 0,
    val namamhs : String,
    val nimmhs : String,
    val notelp : String
) : Parcelable