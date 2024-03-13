package com.example.test

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface IngredientDAO {
    @Insert
    fun insertAll(vararg ingredient: Ingredient)

    @Delete
    fun delete(ingredient: Ingredient)

    @Update
    fun updateIngredient(vararg ingredient: Ingredient)

    @Query("SELECT * FROM ingredient")
    fun getAll(): List<Ingredient>
}
