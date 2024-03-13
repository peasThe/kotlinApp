package com.example.test

import android.content.Context
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
@Serializable
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

fun Context.prepopulateDatabase() {
    val json = assets.open("ingredients.json").bufferedReader().use { it.readText() }
    val ingredients = Json.decodeFromString<List<Ingredient>>(json)
    val ingredientDao = AppDatabase.getInstance(this).ingredientDao()
    ingredients.forEach { ingredient ->
        ingredientDao.insertAll(ingredient)
    }
}