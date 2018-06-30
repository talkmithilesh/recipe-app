package com.mithilesh.recipeapp.services;

import com.mithilesh.recipeapp.models.Recipe;
import com.mithilesh.recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipies() throws Exception {
        Recipe recipe = new Recipe();
        HashSet<Recipe> recipeHashSet = new HashSet();
        recipeHashSet.add(recipe);

        when(recipeService.getRecipes()).thenReturn(recipeHashSet);


        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);

        verify(recipeRepository, times(1)).findAll();
    }
}