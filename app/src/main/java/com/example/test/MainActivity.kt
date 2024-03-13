package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        button1.setOnClickListener {
            startActivity(Intent(this, History::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this, CurrentMenu::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this, RecipeList::class.java))
        }

        val cakeIngredients: Set<Ingredient> = setOf(
            Ingredient("egg").apply { quantity = 2 },
            Ingredient("rice").apply { quantity = 200 }, // assuming 200 grams of rice
            Ingredient("lemon").apply { quantity = 1 }
        )
        var cakeRecipe = Recipe(cakeIngredients, 0, "dessert")
    }
}
