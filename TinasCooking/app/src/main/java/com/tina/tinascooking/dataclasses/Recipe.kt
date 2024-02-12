package com.tina.tinascooking.dataclasses

data class Recipe(
    val recipeTitle: String,
    val image: String,
    val execute: String,
    val isLatest: Boolean,
    val isMainCourse: Boolean,
    val isDessertCourse: Boolean
)

