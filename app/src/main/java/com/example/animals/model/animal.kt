package com.example.animals.model
import androidx.annotation.DrawableRes

data class animal (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val deskripsi: String,
)