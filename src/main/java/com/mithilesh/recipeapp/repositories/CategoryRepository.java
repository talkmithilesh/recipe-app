package com.mithilesh.recipeapp.repositories;

import com.mithilesh.recipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
