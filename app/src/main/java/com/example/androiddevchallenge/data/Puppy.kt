package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Puppy(
    /**
     * name
     */
    val name: String,

    /**
     * desc
     */
    val desc: String,

    /**
     * age
     */
    val age: String,

    /**
     * gender
     */
    val gender: String,

    /**
     * size
     */
    val size: String,

    /**
     * picture
     */
    @DrawableRes val picture: Int,

    /**
     * location
     */
    val location: String
)