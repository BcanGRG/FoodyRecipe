package com.example.foodyrecipe.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foodyrecipe.models.FoodRecipe
import com.example.foodyrecipe.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}