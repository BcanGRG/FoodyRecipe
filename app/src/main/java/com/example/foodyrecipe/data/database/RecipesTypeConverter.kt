package com.example.foodyrecipe.data.database

import androidx.room.TypeConverter
import com.example.foodyrecipe.models.FoodRecipe
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import javax.inject.Inject

class RecipesTypeConverter {

    private val gson: Gson = Gson()

    @TypeConverter
    fun foodRecipeToString(foodRecipe: FoodRecipe): String {
        return gson.toJson(foodRecipe)
    }

    @TypeConverter
    fun stringToFoodRecipe(data: String): FoodRecipe {
        val listType = object : TypeToken<FoodRecipe>() {}.type
        return gson.fromJson(data, listType)
    }
}