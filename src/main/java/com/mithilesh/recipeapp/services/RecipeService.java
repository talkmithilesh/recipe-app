package com.mithilesh.recipeapp.services;

import com.mithilesh.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long id);
}
