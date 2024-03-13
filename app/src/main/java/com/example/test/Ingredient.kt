package com.example.test

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Ingredient(
    @PrimaryKey val ingredientId: Int,
    @ColumnInfo(name="ingredient_name") val ingredientName: String?,
)

@Entity
data class Recipe(
    @PrimaryKey val recipeId: Int,
    val season: Int,
    val type: String
)

@Entity(primaryKeys = ["ingredientId", "recipeId"])
data class RecipeIngredientsCrossRef(
    val ingredientId: Int,
    val recipeId: Int
)
