package com.joseph.amour.persistence;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joseph.amour.recipe.Recipe;


@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

	List<Recipe> findByNameContainingIgnoreCase(String name);

	List<Recipe> findByCategory(String category);

	List<Recipe> findByCategory(String category, String tag);

	List<Recipe> findByUser(String user);

}
