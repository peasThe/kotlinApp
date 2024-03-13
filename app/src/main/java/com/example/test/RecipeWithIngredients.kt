package com.example.test

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class RecipeWithIngredients(
    @Embedded val recipe: Recipe,
    @Relation(
        parentColumn = "recipeId",
        entityColumn = "ingredientId",
        associateBy = Junction(RecipeIngredientsCrossRef::class)
    )
    val ingredients: List<Ingredient>
)

data class IngredientWithRecipes(
    @Embedded val ingredient: Ingredient,
    @Relation(
        parentColumn = "ingredientId",
        entityColumn = "recipeId",
        associateBy = Junction(RecipeIngredientsCrossRef::class)
    )
    val recipes: List<Recipe>
)
