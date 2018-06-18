package com.mithilesh.recipeapp.repositories;

import com.mithilesh.recipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findCategoryByDescription(String description);
}
