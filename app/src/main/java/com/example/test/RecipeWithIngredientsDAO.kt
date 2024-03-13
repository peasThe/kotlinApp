package com.example.test

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface RecipeWithIngredientsDAO {
    @Transaction
    @Query("SELECT * FROM Recipe")
    fun getRecipeWithIngredients(): List< RecipeWithIngredients>

}