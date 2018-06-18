package com.mithilesh.recipeapp.repositories;

import com.mithilesh.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}