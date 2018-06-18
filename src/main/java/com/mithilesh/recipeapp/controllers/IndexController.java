package com.mithilesh.recipeapp.controllers;

import com.mithilesh.recipeapp.models.Category;
import com.mithilesh.recipeapp.models.UnitOfMeasure;
import com.mithilesh.recipeapp.repositories.CategoryRepository;
import com.mithilesh.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/", "", "/index"})
    public String indexView(Model model) {
        Optional<Category> category = categoryRepository.findCategoryByDescription("Mexican");
        Optional<UnitOfMeasure> uom = unitOfMeasureRepository.findByUnit("Ounce");

        System.out.println("Category id: " + category.get().getId());
        System.out.println("Uom id: " + uom.get().getId());

        return "index";
    }
}
