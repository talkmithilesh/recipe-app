package com.mithilesh.recipeapp.controllers;

import com.mithilesh.recipeapp.models.Category;
import com.mithilesh.recipeapp.models.UnitOfMeasure;
import com.mithilesh.recipeapp.repositories.CategoryRepository;
import com.mithilesh.recipeapp.repositories.UnitOfMeasureRepository;
import com.mithilesh.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index"})
    public String indexView(Model model) {
        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
