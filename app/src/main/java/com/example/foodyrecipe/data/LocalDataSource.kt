package com.example.foodyrecipe.data

import com.example.foodyrecipe.data.database.RecipesDao
import com.example.foodyrecipe.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {

    fun readDatabase(): Flow<List<RecipesEntity>> = recipesDao.readRecipes()

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }

}