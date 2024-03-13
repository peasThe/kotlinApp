package com.example.test

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface IngredientWithRecipesDAO {
    @Transaction
    @Query("SELECT * FROM Ingredient")
    fun getIngredientWithRecipes(): List<IngredientWithRecipes>

}