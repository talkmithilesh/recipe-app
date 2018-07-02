package com.mithilesh.recipeapp.services;

import com.mithilesh.recipeapp.models.Recipe;
import com.mithilesh.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();

        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);

        return recipes;
    }

    @Override
    public Recipe findById(Long id) {
        Optional<Recipe> recipe = recipeRepository.findById(id);

        if (!recipe.isPresent()) {
            throw new RuntimeException("Recipe not found");
        }

        return recipe.get();
    }
}
