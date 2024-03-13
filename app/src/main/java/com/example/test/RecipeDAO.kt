package com.example.test

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface RecipeDAO {
    @Insert
    fun insertAll(vararg recipe: Recipe)

    @Delete
    fun delete(recipe: Recipe)

    @Update
    fun updateIngredient(vararg recipe: Recipe)

    @Query("SELECT * FROM recipe")
    fun getAll(): List<Recipe>
}
