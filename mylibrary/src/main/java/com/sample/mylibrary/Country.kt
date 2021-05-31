package com.sample.mylibrary

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
internal data class Country (
    val code: String,
    val name: String
) : Parcelable

